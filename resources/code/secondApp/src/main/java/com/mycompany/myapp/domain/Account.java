package com.mycompany.myapp.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "account")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name = "password")
	private String password
	
	@Column(name = "username")
	private String username
	
	@OneToMany(mappedBy=Account)
	private Set<Bookmark> bookmark

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public Account password(String password) {
        this.password = password;
        return this;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public Account username(String username) {
        this.username = username;
        return this;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
	public Bookmark getBookmark() {
        return bookmark;
    }

    public Account bookmark(Bookmark bookmark) {
        this.bookmark = bookmark;
        return this;
    }

    public void setBookmark(Bookmark bookmark) {
        this.bookmark = bookmark;
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
            ", password='" + getPassword() + "'" +		
            ", username='" + getUsername() + "'" +		
            "}";
    }
}

