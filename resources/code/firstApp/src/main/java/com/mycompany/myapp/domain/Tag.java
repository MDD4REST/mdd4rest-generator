package com.mycompany.myapp.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tag")
public class Tag implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name = "tagText")
	private String tagText
	

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTagText() {
        return tagText;
    }

    public Tag tagText(String tagText) {
        this.tagText = tagText;
        return this;
    }

    public void setTagText(String tagText) {
        this.tagText = tagText;
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
            ", tagText='" + getTagText() + "'" +		
            "}";
    }
}

