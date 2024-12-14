package org.example.account;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AccountDtoTest {

    @Test
    void accountDto() {
        //given
        //when
        //then

        AccountDto accountDto = new AccountDto("accountNumber", "summer", LocalDateTime.now());

//        accountDto.setAccountNumber("accountNumber");
//        accountDto.setNickname("summer");

        System.out.println(accountDto.getAccountNumber());
        System.out.println(accountDto);

    }

}