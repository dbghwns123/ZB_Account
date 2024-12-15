package org.example.account.service;

import org.example.account.domain.Account;
import org.example.account.domain.AccountStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountServiceTest {

    @Autowired
    AccountService accountService;

    @BeforeEach
    void init() {
        accountService.createAccount();
    }

    @Test
    @DisplayName("Test 이름 변경")
    void testGetAccount() {
        Account account = accountService.getAccount(1L);

        assertEquals("40000", account.getAccountNumber());
        assertEquals(AccountStatus.IN_USE, account.getAccountStatus());

    }

    @Test
    void testGetAccount2() {
        Account account = accountService.getAccount(2L);

        assertEquals("40000", account.getAccountNumber());
        assertEquals(AccountStatus.IN_USE, account.getAccountStatus());

    }

//    practice
//    @Test
//    void test() {
//         //given
//         //when
//         //then
//        String something = "Hello " + "World";
//
//        assertEquals("Hello World", something);
//    }
}