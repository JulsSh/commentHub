package com.joulea.commentHub.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255, nullable = false, unique = true)
    private String login;

    @Column(name="password_hash", length = 255, nullable = false)
    private String passwordHash;

    @Column(length = 20,  nullable = false )
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name="created_at", nullable = false, updatable = false )
    private Instant createdAt;

}
