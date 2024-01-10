package com.example.againproject.controller;

import com.example.againproject.dto.MemberForm;
import com.example.againproject.entity.Member;
import com.example.againproject.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/sigup")
    public String signUpPage() {
        return "members/new";
    }

    @PostMapping("/join")
    public String member(MemberForm memberForm) {
        System.out.println(memberForm.toString());
        Member member = memberForm.toEntity();
        System.out.println(member.toString());
        Member saved = memberRepository.save(member);
        System.out.println(saved.toString());
        return "";
    }
}
