package org.example.account;

import lombok.*;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;

// lombok의 기능들 실습 및 테스트
@Getter
@Setter
@ToString
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
//@Data  // 주의해서 사용
@Slf4j // 해당 클래스의 logger를 자동 생성

public class AccountDto {
    private String accountNumber;
    private String nickname;
    private LocalDateTime registeredAt;

    public void log() {
        log.error("error is occurred.");

    }
}
