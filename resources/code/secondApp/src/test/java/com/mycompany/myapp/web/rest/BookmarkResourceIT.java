package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.SecondApp;
import com.mycompany.myapp.domain.Bookmark;
import com.mycompany.myapp.repository.BookmarkRepository;
import com.mycompany.myapp.web.rest.errors.ExceptionTranslator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Validator;

import javax.persistence.EntityManager;
import java.util.List;

import static com.mycompany.myapp.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.mycompany.myapp.domain.enumeration.VisibilityType;
/**
 * Integration tests for the {@Link BookmarkResource} REST controller.
 */
@SpringBootTest(classes = SecondApp.class)
public class BookmarkResourceIT {

    private static final String DEFAULT_BOOKMARK_NAME = "AAAAAAAAAA";
    private static final String UPDATED_BOOKMARK_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_BOOKMARK_URL = "AAAAAAAAAA";
    private static final String UPDATED_BOOKMARK_URL = "BBBBBBBBBB";

    private static final VisibilityType DEFAULT_VISIBILITY = VisibilityType.PUBLIC;
    private static final VisibilityType UPDATED_VISIBILITY = VisibilityType.PRIVATE;

    @Autowired
    private BookmarkRepository bookmarkRepository;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    @Autowired
    private Validator validator;

    private MockMvc restBookmarkMockMvc;

    private Bookmark bookmark;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final BookmarkResource bookmarkResource = new BookmarkResource(bookmarkRepository);
        this.restBookmarkMockMvc = MockMvcBuilders.standaloneSetup(bookmarkResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter)
            .setValidator(validator).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Bookmark createEntity(EntityManager em) {
        Bookmark bookmark = new Bookmark()
            .bookmarkName(DEFAULT_BOOKMARK_NAME)
            .bookmarkUrl(DEFAULT_BOOKMARK_URL)
            .visibility(DEFAULT_VISIBILITY);
        return bookmark;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Bookmark createUpdatedEntity(EntityManager em) {
        Bookmark bookmark = new Bookmark()
            .bookmarkName(UPDATED_BOOKMARK_NAME)
            .bookmarkUrl(UPDATED_BOOKMARK_URL)
            .visibility(UPDATED_VISIBILITY);
        return bookmark;
    }

    @BeforeEach
    public void initTest() {
        bookmark = createEntity(em);
    }

    @Test
    @Transactional
    public void createBookmark() throws Exception {
        int databaseSizeBeforeCreate = bookmarkRepository.findAll().size();

        // Create the Bookmark
        restBookmarkMockMvc.perform(post("/api/bookmarks")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(bookmark)))
            .andExpect(status().isCreated());

        // Validate the Bookmark in the database
        List<Bookmark> bookmarkList = bookmarkRepository.findAll();
        assertThat(bookmarkList).hasSize(databaseSizeBeforeCreate + 1);
        Bookmark testBookmark = bookmarkList.get(bookmarkList.size() - 1);
        assertThat(testBookmark.getBookmarkName()).isEqualTo(DEFAULT_BOOKMARK_NAME);
        assertThat(testBookmark.getBookmarkUrl()).isEqualTo(DEFAULT_BOOKMARK_URL);
        assertThat(testBookmark.getVisibility()).isEqualTo(DEFAULT_VISIBILITY);
    }

    @Test
    @Transactional
    public void createBookmarkWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = bookmarkRepository.findAll().size();

        // Create the Bookmark with an existing ID
        bookmark.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restBookmarkMockMvc.perform(post("/api/bookmarks")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(bookmark)))
            .andExpect(status().isBadRequest());

        // Validate the Bookmark in the database
        List<Bookmark> bookmarkList = bookmarkRepository.findAll();
        assertThat(bookmarkList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void getAllBookmarks() throws Exception {
        // Initialize the database
        bookmarkRepository.saveAndFlush(bookmark);

        // Get all the bookmarkList
        restBookmarkMockMvc.perform(get("/api/bookmarks?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(bookmark.getId().intValue())))
            .andExpect(jsonPath("$.[*].bookmarkName").value(hasItem(DEFAULT_BOOKMARK_NAME.toString())))
            .andExpect(jsonPath("$.[*].bookmarkUrl").value(hasItem(DEFAULT_BOOKMARK_URL.toString())))
            .andExpect(jsonPath("$.[*].visibility").value(hasItem(DEFAULT_VISIBILITY.toString())));
    }
    
    @Test
    @Transactional
    public void getBookmark() throws Exception {
        // Initialize the database
        bookmarkRepository.saveAndFlush(bookmark);

        // Get the bookmark
        restBookmarkMockMvc.perform(get("/api/bookmarks/{id}", bookmark.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(bookmark.getId().intValue()))
            .andExpect(jsonPath("$.bookmarkName").value(DEFAULT_BOOKMARK_NAME.toString()))
            .andExpect(jsonPath("$.bookmarkUrl").value(DEFAULT_BOOKMARK_URL.toString()))
            .andExpect(jsonPath("$.visibility").value(DEFAULT_VISIBILITY.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingBookmark() throws Exception {
        // Get the bookmark
        restBookmarkMockMvc.perform(get("/api/bookmarks/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateBookmark() throws Exception {
        // Initialize the database
        bookmarkRepository.saveAndFlush(bookmark);

        int databaseSizeBeforeUpdate = bookmarkRepository.findAll().size();

        // Update the bookmark
        Bookmark updatedBookmark = bookmarkRepository.findById(bookmark.getId()).get();
        // Disconnect from session so that the updates on updatedBookmark are not directly saved in db
        em.detach(updatedBookmark);
        updatedBookmark
            .bookmarkName(UPDATED_BOOKMARK_NAME)
            .bookmarkUrl(UPDATED_BOOKMARK_URL)
            .visibility(UPDATED_VISIBILITY);

        restBookmarkMockMvc.perform(put("/api/bookmarks")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(updatedBookmark)))
            .andExpect(status().isOk());

        // Validate the Bookmark in the database
        List<Bookmark> bookmarkList = bookmarkRepository.findAll();
        assertThat(bookmarkList).hasSize(databaseSizeBeforeUpdate);
        Bookmark testBookmark = bookmarkList.get(bookmarkList.size() - 1);
        assertThat(testBookmark.getBookmarkName()).isEqualTo(UPDATED_BOOKMARK_NAME);
        assertThat(testBookmark.getBookmarkUrl()).isEqualTo(UPDATED_BOOKMARK_URL);
        assertThat(testBookmark.getVisibility()).isEqualTo(UPDATED_VISIBILITY);
    }

    @Test
    @Transactional
    public void updateNonExistingBookmark() throws Exception {
        int databaseSizeBeforeUpdate = bookmarkRepository.findAll().size();

        // Create the Bookmark

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restBookmarkMockMvc.perform(put("/api/bookmarks")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(bookmark)))
            .andExpect(status().isBadRequest());

        // Validate the Bookmark in the database
        List<Bookmark> bookmarkList = bookmarkRepository.findAll();
        assertThat(bookmarkList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteBookmark() throws Exception {
        // Initialize the database
        bookmarkRepository.saveAndFlush(bookmark);

        int databaseSizeBeforeDelete = bookmarkRepository.findAll().size();

        // Delete the bookmark
        restBookmarkMockMvc.perform(delete("/api/bookmarks/{id}", bookmark.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<Bookmark> bookmarkList = bookmarkRepository.findAll();
        assertThat(bookmarkList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Bookmark.class);
        Bookmark bookmark1 = new Bookmark();
        bookmark1.setId(1L);
        Bookmark bookmark2 = new Bookmark();
        bookmark2.setId(bookmark1.getId());
        assertThat(bookmark1).isEqualTo(bookmark2);
        bookmark2.setId(2L);
        assertThat(bookmark1).isNotEqualTo(bookmark2);
        bookmark1.setId(null);
        assertThat(bookmark1).isNotEqualTo(bookmark2);
    }
}
