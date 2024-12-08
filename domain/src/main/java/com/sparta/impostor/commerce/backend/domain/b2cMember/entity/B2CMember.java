package com.sparta.impostor.commerce.backend.domain.b2cMember.entity;

import com.sparta.impostor.commerce.backend.common.baseentity.Timestamped;
import com.sparta.impostor.commerce.backend.domain.b2cMember.enums.B2CMemberStatus;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class B2CMember extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private B2CMemberStatus status;
}
