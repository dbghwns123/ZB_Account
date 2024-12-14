package org.example.account.controller;

import lombok.RequiredArgsConstructor;
import org.example.account.domain.Account;
import org.example.account.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {
    // Controller 는 Service 만 의존
    private final AccountService accountService;

    @GetMapping("/create-account")
    public String createAccount() {
        accountService.createAccount();
        return "success";
    }

    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable Long id) { // 객체 자체를 반환하면 JSON 형식으로 보인다
        return accountService.getAccount(id);
    }
}
