package com.mycompany.myapp.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "bookmark")
public class Bookmark implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name = "bookmarkName")
	private String bookmarkName
	
	@Column(name = "bookmarkUrl")
	private String bookmarkUrl
	
	@Column(name = "visibility")
	private VisibilityType visibility
	
	@OneToMany(mappedBy=Bookmark)
	private Set<Tag> tag

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookmarkName() {
        return bookmarkName;
    }

    public Bookmark bookmarkName(String bookmarkName) {
        this.bookmarkName = bookmarkName;
        return this;
    }

    public void setBookmarkName(String bookmarkName) {
        this.bookmarkName = bookmarkName;
    }
    
    public String getBookmarkUrl() {
        return bookmarkUrl;
    }

    public Bookmark bookmarkUrl(String bookmarkUrl) {
        this.bookmarkUrl = bookmarkUrl;
        return this;
    }

    public void setBookmarkUrl(String bookmarkUrl) {
        this.bookmarkUrl = bookmarkUrl;
    }
    
    public VisibilityType getVisibility() {
        return visibility;
    }

    public Bookmark visibility(VisibilityType visibility) {
        this.visibility = visibility;
        return this;
    }

    public void setVisibility(VisibilityType visibility) {
        this.visibility = visibility;
    }
    
	public Tag getTag() {
        return tag;
    }

    public Bookmark tag(Tag tag) {
        this.tag = tag;
        return this;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Bookmark)) {
            return false;
        }
        return id != null && id.equals(((Bookmark) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Bookmark{" +
            "id=" + getId() +
            ", bookmarkName='" + getBookmarkName() + "'" +		
            ", bookmarkUrl='" + getBookmarkUrl() + "'" +		
            ", visibility='" + getVisibility() + "'" +		
            "}";
    }
}

