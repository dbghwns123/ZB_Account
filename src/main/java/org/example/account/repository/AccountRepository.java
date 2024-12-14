package org.example.account.repository;

import org.example.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> { // 1: 사용할 엔터티 , 2: 사용할 엔터티의 기본키의 타입

}
