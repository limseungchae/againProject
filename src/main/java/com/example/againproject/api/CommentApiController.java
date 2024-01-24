package com.example.againproject.api;

import com.example.againproject.dto.CommentDto;
import com.example.againproject.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentApiController {
    @Autowired
    private CommentService commentService;
    // 1. 댓글 조회
    @GetMapping("/api/articles/{articleId}/comments") // 댓글 조회 요청 접수
    public ResponseEntity<List<CommentDto>> comments(@PathVariable Long articleId) {
        // 서비스에 위임
        List<CommentDto> dtos = commentService.comments(articleId);
        // 결과 응답
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }
    // 2. 댓글 생성
    @PostMapping("/api/articles/{aticleId}/comments") // 댓글 생성 요청 접수
    public ResponseEntity<CommentDto> create(@PathVariable Long articleId,
                                             @RequestBody CommentDto dto) {
        // 서비스에 위임
        CommentDto createDto = commentService.create(articleId, dto);
        // 결과 응답
        return ResponseEntity.status(HttpStatus.OK).body(createDto);
    }
    // 3. 댓글 수정
    @PatchMapping("/api/comments/{id}") // 댓글 수정 요청 접수
    public ResponseEntity<CommentDto> update(@PathVariable Long id,
                                             @RequestBody CommentDto dto) {
        // 서비스에 위임
        CommentDto updatedDto = commentService.update(id, dto);
        // 결과 응답
        return ResponseEntity.status(HttpStatus.OK).body(updatedDto);
    }
    // 4. 댓글 삭제
}
