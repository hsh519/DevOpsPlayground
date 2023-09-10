package com.example.devOpsPlayground.member;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping(value = {"", "/"})
    public String home() {
        return "home";
    }

    @GetMapping("/join")
    public String joinForm(Model model) {
        model.addAttribute("memberForm", new MemberForm());
        return "join";
    }

    @PostMapping("/join")
    public String join(Member member) {
        memberRepository.save(member);
        return "redirect:/";
    }

    @GetMapping("/list")
    public String memberList(Model model) {
        List<Member> all = memberRepository.findAll();
        model.addAttribute("list", all);
        return "list";
    }
}
