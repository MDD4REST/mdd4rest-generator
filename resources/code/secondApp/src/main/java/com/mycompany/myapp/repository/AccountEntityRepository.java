package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.AccountEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AccountEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AccountEntityRepository extends JpaRepository<AccountEntity, Long> {

}
