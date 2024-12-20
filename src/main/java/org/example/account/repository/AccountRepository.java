package org.example.account.repository;

import org.example.account.domain.Account;
import org.example.account.domain.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> { // 1: 사용할 엔터티 , 2: 사용할 엔터티의 기본키의 타입
    Optional<Account> findFirstByOrderByIdDesc();

    Integer countByAccountUser(AccountUser accountUser);

}
