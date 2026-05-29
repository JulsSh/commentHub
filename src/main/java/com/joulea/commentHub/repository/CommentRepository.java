package com.joulea.commentHub.repository;

import com.joulea.commentHub.entity.Comment;
import com.joulea.commentHub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    public List<Comment> findByUser(User user);
}
