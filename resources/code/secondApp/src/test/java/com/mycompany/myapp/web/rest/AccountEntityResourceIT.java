package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.SecondApp;
import com.mycompany.myapp.domain.AccountEntity;
import com.mycompany.myapp.repository.AccountEntityRepository;
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

/**
 * Integration tests for the {@Link AccountEntityResource} REST controller.
 */
@SpringBootTest(classes = SecondApp.class)
public class AccountEntityResourceIT {

    private static final String DEFAULT_USERNAME = "AAAAAAAAAA";
    private static final String UPDATED_USERNAME = "BBBBBBBBBB";

    private static final String DEFAULT_PASSWORD = "AAAAAAAAAA";
    private static final String UPDATED_PASSWORD = "BBBBBBBBBB";

    @Autowired
    private AccountEntityRepository accountEntityRepository;

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

    private MockMvc restAccountEntityMockMvc;

    private AccountEntity accountEntity;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final AccountEntityResource accountEntityResource = new AccountEntityResource(accountEntityRepository);
        this.restAccountEntityMockMvc = MockMvcBuilders.standaloneSetup(accountEntityResource)
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
    public static AccountEntity createEntity(EntityManager em) {
        AccountEntity accountEntity = new AccountEntity()
            .username(DEFAULT_USERNAME)
            .password(DEFAULT_PASSWORD);
        return accountEntity;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static AccountEntity createUpdatedEntity(EntityManager em) {
        AccountEntity accountEntity = new AccountEntity()
            .username(UPDATED_USERNAME)
            .password(UPDATED_PASSWORD);
        return accountEntity;
    }

    @BeforeEach
    public void initTest() {
        accountEntity = createEntity(em);
    }

    @Test
    @Transactional
    public void createAccountEntity() throws Exception {
        int databaseSizeBeforeCreate = accountEntityRepository.findAll().size();

        // Create the AccountEntity
        restAccountEntityMockMvc.perform(post("/api/account-entities")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(accountEntity)))
            .andExpect(status().isCreated());

        // Validate the AccountEntity in the database
        List<AccountEntity> accountEntityList = accountEntityRepository.findAll();
        assertThat(accountEntityList).hasSize(databaseSizeBeforeCreate + 1);
        AccountEntity testAccountEntity = accountEntityList.get(accountEntityList.size() - 1);
        assertThat(testAccountEntity.getUsername()).isEqualTo(DEFAULT_USERNAME);
        assertThat(testAccountEntity.getPassword()).isEqualTo(DEFAULT_PASSWORD);
    }

    @Test
    @Transactional
    public void createAccountEntityWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = accountEntityRepository.findAll().size();

        // Create the AccountEntity with an existing ID
        accountEntity.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restAccountEntityMockMvc.perform(post("/api/account-entities")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(accountEntity)))
            .andExpect(status().isBadRequest());

        // Validate the AccountEntity in the database
        List<AccountEntity> accountEntityList = accountEntityRepository.findAll();
        assertThat(accountEntityList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void getAllAccountEntities() throws Exception {
        // Initialize the database
        accountEntityRepository.saveAndFlush(accountEntity);

        // Get all the accountEntityList
        restAccountEntityMockMvc.perform(get("/api/account-entities?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(accountEntity.getId().intValue())))
            .andExpect(jsonPath("$.[*].username").value(hasItem(DEFAULT_USERNAME.toString())))
            .andExpect(jsonPath("$.[*].password").value(hasItem(DEFAULT_PASSWORD.toString())));
    }
    
    @Test
    @Transactional
    public void getAccountEntity() throws Exception {
        // Initialize the database
        accountEntityRepository.saveAndFlush(accountEntity);

        // Get the accountEntity
        restAccountEntityMockMvc.perform(get("/api/account-entities/{id}", accountEntity.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(accountEntity.getId().intValue()))
            .andExpect(jsonPath("$.username").value(DEFAULT_USERNAME.toString()))
            .andExpect(jsonPath("$.password").value(DEFAULT_PASSWORD.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingAccountEntity() throws Exception {
        // Get the accountEntity
        restAccountEntityMockMvc.perform(get("/api/account-entities/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateAccountEntity() throws Exception {
        // Initialize the database
        accountEntityRepository.saveAndFlush(accountEntity);

        int databaseSizeBeforeUpdate = accountEntityRepository.findAll().size();

        // Update the accountEntity
        AccountEntity updatedAccountEntity = accountEntityRepository.findById(accountEntity.getId()).get();
        // Disconnect from session so that the updates on updatedAccountEntity are not directly saved in db
        em.detach(updatedAccountEntity);
        updatedAccountEntity
            .username(UPDATED_USERNAME)
            .password(UPDATED_PASSWORD);

        restAccountEntityMockMvc.perform(put("/api/account-entities")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(updatedAccountEntity)))
            .andExpect(status().isOk());

        // Validate the AccountEntity in the database
        List<AccountEntity> accountEntityList = accountEntityRepository.findAll();
        assertThat(accountEntityList).hasSize(databaseSizeBeforeUpdate);
        AccountEntity testAccountEntity = accountEntityList.get(accountEntityList.size() - 1);
        assertThat(testAccountEntity.getUsername()).isEqualTo(UPDATED_USERNAME);
        assertThat(testAccountEntity.getPassword()).isEqualTo(UPDATED_PASSWORD);
    }

    @Test
    @Transactional
    public void updateNonExistingAccountEntity() throws Exception {
        int databaseSizeBeforeUpdate = accountEntityRepository.findAll().size();

        // Create the AccountEntity

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restAccountEntityMockMvc.perform(put("/api/account-entities")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(accountEntity)))
            .andExpect(status().isBadRequest());

        // Validate the AccountEntity in the database
        List<AccountEntity> accountEntityList = accountEntityRepository.findAll();
        assertThat(accountEntityList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteAccountEntity() throws Exception {
        // Initialize the database
        accountEntityRepository.saveAndFlush(accountEntity);

        int databaseSizeBeforeDelete = accountEntityRepository.findAll().size();

        // Delete the accountEntity
        restAccountEntityMockMvc.perform(delete("/api/account-entities/{id}", accountEntity.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<AccountEntity> accountEntityList = accountEntityRepository.findAll();
        assertThat(accountEntityList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(AccountEntity.class);
        AccountEntity accountEntity1 = new AccountEntity();
        accountEntity1.setId(1L);
        AccountEntity accountEntity2 = new AccountEntity();
        accountEntity2.setId(accountEntity1.getId());
        assertThat(accountEntity1).isEqualTo(accountEntity2);
        accountEntity2.setId(2L);
        assertThat(accountEntity1).isNotEqualTo(accountEntity2);
        accountEntity1.setId(null);
        assertThat(accountEntity1).isNotEqualTo(accountEntity2);
    }
}
