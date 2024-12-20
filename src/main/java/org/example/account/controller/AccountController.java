package org.example.account.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.account.domain.Account;
import org.example.account.dto.AccountDto;
import org.example.account.dto.CreateAccount;
import org.example.account.service.AccountService;
import org.example.account.service.RedisTestService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    private final RedisTestService redisTestService;

    @PostMapping("/account")
    public CreateAccount.Response createAccount(@RequestBody @Valid CreateAccount.Request request) {
        return CreateAccount.Response.from(accountService.createAccount(request.getUserId(), request.getInitialBalance()));
    }

    @GetMapping("/get-lock")
    public String getLock() {
        return redisTestService.getLock();
    }

    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable Long id) { // 객체 자체를 반환하면 JSON 형식으로 표현
        return accountService.getAccount(id);
    }
}
