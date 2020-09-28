package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Tag;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface TagRepository extends JpaRepository<Tag, String> {
}