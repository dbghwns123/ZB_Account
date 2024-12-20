package org.example.account.domain;//package org.example.account.domain;

import jakarta.persistence.*;
import lombok.*;
import org.example.account.type.AccountStatus;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // 이 클래스가 JPA Entity임을 나타낸다. JPA는 Entity 클래스를 기반으로 테이블을 자동으로 생성한다.
@EntityListeners(AuditingEntityListener.class)  // 역할: 엔티티의 변경 시 이벤트(예: 생성, 수정 등)를 감지하여 특정 동작을 수행하도록 설정.
public class Account {
    @Id // 기본키 지정
    @GeneratedValue // 기본키 값을 자동 생성
    private Long id;

    @ManyToOne
    private AccountUser accountUser;
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;
    private Long balance;

    private LocalDateTime registeredAt;
    private LocalDateTime unRegisteredAt;

    @CreatedDate // 전제조건: @EntityListeners(AuditingEntityListener.class)와 함께 사용해야 동작.
    private LocalDateTime createdAt;
    @LastModifiedDate  // 전제조건: @EntityListeners(AuditingEntityListener.class)와 함께 사용해야 동작.
    private LocalDateTime updatedAt;

}
