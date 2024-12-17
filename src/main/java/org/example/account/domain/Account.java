package org.example.account.domain;//package org.example.account.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.account.domain.AccountStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // 이 클래스가 JPA Entity임을 나타낸다. JPA는 Entity 클래스를 기반으로 테이블을 자동으로 생성한다.
public class Account {
    @Id // 기본키 지정
    @GeneratedValue // 기본키 값을 자동 생성
    private Long id;

    private String accountNumber;

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

}
