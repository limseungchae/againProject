package com.example.againproject.service;

import com.example.againproject.dto.CommentDto;
import com.example.againproject.repository.ArticleRepository;
import com.example.againproject.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository; // 댓글 리파지터리
    @Autowired
    private ArticleRepository articleRepository; // 게시글 리파지터리

    public List<CommentDto> comments(Long articleId) {
        // 1. 댓글 조회
        // 2. 엔티티 -> DTO 변환
        // 3. 결과 반환
    }
}
