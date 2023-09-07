package com.example.devOpsPlayground.member;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    @PostMapping("/join")
    public Member join(@RequestBody Member member) {
        memberRepository.save(member);
        return member;
    }
}
