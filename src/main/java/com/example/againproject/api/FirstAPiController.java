package com.example.againproject.api;

import com.example.againproject.entity.Article;
import com.example.againproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // REST API용 컨트롤러
public class FirstAPiController {
    @Autowired
    private ArticleRepository articleRepository;
    // GET
    @GetMapping("/api/articles")
    public List<Article> index() {
        return articleRepository.findAll();
    }
    // POST
    // PATCH
    // DELETE
}
