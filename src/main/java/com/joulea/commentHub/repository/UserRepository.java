package com.joulea.commentHub.repository;

import com.joulea.commentHub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findUserByLogin(String login);
}
