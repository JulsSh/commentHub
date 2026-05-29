package com.joulea.commentHub.dto.response;


import java.time.Instant;

public record CommentResponse(String content,
                              String author,
                              Instant createdAt) {
}
