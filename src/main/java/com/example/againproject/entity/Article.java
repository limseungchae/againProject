package com.example.againproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    @GeneratedValue // 1, 2, 3, .... 자동 생성 어노테이션!
    private Long id; // 주의! 데이터 타입을 String -> Long 변경해야 함

    @Column
    private String title;

    @Column
    private String content;
}
