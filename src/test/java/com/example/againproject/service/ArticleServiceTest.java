package com.example.againproject.service;

import com.example.againproject.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest // 해당 클래스를 스프링 부트와 연동해 테스트
class ArticleServiceTest {

    @Autowired
    ArticleService articleService; // articleService 객체 주입

    @Test
    void index() {
        // 1. 예상 테이터
        // 2. 실제 데이터
        List<Article> articles = articleService.index();
        // 3. 비교 및 검증
    }
}