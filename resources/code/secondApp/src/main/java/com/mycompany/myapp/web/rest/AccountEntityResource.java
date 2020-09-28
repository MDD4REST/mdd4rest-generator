package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.domain.AccountEntity;
import com.mycompany.myapp.repository.AccountEntityRepository;
import com.mycompany.myapp.web.rest.errors.BadRequestAlertException;

import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link com.mycompany.myapp.domain.AccountEntity}.
 */
@RestController
@RequestMapping("/api")
public class AccountEntityResource {

    private final Logger log = LoggerFactory.getLogger(AccountEntityResource.class);

    private static final String ENTITY_NAME = "accountEntity";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final AccountEntityRepository accountEntityRepository;

    public AccountEntityResource(AccountEntityRepository accountEntityRepository) {
        this.accountEntityRepository = accountEntityRepository;
    }

    /**
     * {@code POST  /account-entities} : Create a new accountEntity.
     *
     * @param accountEntity the accountEntity to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new accountEntity, or with status {@code 400 (Bad Request)} if the accountEntity has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/account-entities")
    public ResponseEntity<AccountEntity> createAccountEntity(@RequestBody AccountEntity accountEntity) throws URISyntaxException {
        log.debug("REST request to save AccountEntity : {}", accountEntity);
        if (accountEntity.getId() != null) {
            throw new BadRequestAlertException("A new accountEntity cannot already have an ID", ENTITY_NAME, "idexists");
        }
        AccountEntity result = accountEntityRepository.save(accountEntity);
        return ResponseEntity.created(new URI("/api/account-entities/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /account-entities} : Updates an existing accountEntity.
     *
     * @param accountEntity the accountEntity to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated accountEntity,
     * or with status {@code 400 (Bad Request)} if the accountEntity is not valid,
     * or with status {@code 500 (Internal Server Error)} if the accountEntity couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/account-entities")
    public ResponseEntity<AccountEntity> updateAccountEntity(@RequestBody AccountEntity accountEntity) throws URISyntaxException {
        log.debug("REST request to update AccountEntity : {}", accountEntity);
        if (accountEntity.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        AccountEntity result = accountEntityRepository.save(accountEntity);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, accountEntity.getId().toString()))
            .body(result);
    }

    /**
     * {@code GET  /account-entities} : get all the accountEntities.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of accountEntities in body.
     */
    @GetMapping("/account-entities")
    public List<AccountEntity> getAllAccountEntities() {
        log.debug("REST request to get all AccountEntities");
        return accountEntityRepository.findAll();
    }

    /**
     * {@code GET  /account-entities/:id} : get the "id" accountEntity.
     *
     * @param id the id of the accountEntity to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the accountEntity, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/account-entities/{id}")
    public ResponseEntity<AccountEntity> getAccountEntity(@PathVariable Long id) {
        log.debug("REST request to get AccountEntity : {}", id);
        Optional<AccountEntity> accountEntity = accountEntityRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(accountEntity);
    }

    /**
     * {@code DELETE  /account-entities/:id} : delete the "id" accountEntity.
     *
     * @param id the id of the accountEntity to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/account-entities/{id}")
    public ResponseEntity<Void> deleteAccountEntity(@PathVariable Long id) {
        log.debug("REST request to delete AccountEntity : {}", id);
        accountEntityRepository.deleteById(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString())).build();
    }
}
