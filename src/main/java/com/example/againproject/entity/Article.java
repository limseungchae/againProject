package com.example.againproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // DB가 해당 객체를 인식 가능!
@AllArgsConstructor // 생성자 추가 어노테이션
@NoArgsConstructor // 기본 생성자 추가 어노테이션
@ToString
@Getter // 롬복으로 게터 추가
public class Article {

    @Id // 대표값을 지정! like a 주민등록번호
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 id 자동 생성
    private Long id; // 주의! 데이터 타입을 String -> Long 변경해야 함

    @Column
    private String title;

    @Column
    private String content;

    public void patch(Article article) {
        if (article.title != null)
            this.title = article.title;
        if (article.content != null)
            this.content = article.content;
    }
}
