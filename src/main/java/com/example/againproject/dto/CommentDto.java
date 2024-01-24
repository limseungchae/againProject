package com.example.againproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // 모든 필드 생성자
@NoArgsConstructor // 기본 생성자
@Getter // 값 조회
@ToString // 모든 필드 출력
public class CommentDto {
    private Long id; // 댓글의 id
    private Long articleId; // 댓글의 부모 id
    private String nickname; // 댓글 작성자
    private String body; // 댓글 본문
}
