package com.example.againproject.service;

import com.example.againproject.repository.ArticleRepository;
import com.example.againproject.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository; // 댓글 리파지터리
    @Autowired
    private ArticleRepository articleRepository; // 게시글 리파지터리
}
