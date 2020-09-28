package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Account;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AccountRepository extends JpaRepository<Account, String> {
}