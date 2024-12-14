package org.example.account.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Account {
    @Id // 기본키 지정
    @GeneratedValue // 기본키 값을 자동 생성
    private Long id;

    private String accountNumber;

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

}
