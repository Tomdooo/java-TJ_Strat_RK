package cz.uhk.tj_start_rk.controllers;

import cz.uhk.tj_start_rk.model.Member;
import cz.uhk.tj_start_rk.model.Team;
import cz.uhk.tj_start_rk.repositories.MemberRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MemberController {
    private MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/members")
    public List<Member> getMembers() {
        List<Member> members = memberRepository.findAll();
        System.out.println("members.toString()");
        return members;
    }
    @GetMapping("/members/{id}")
    public Optional<Member> getTeams(@PathVariable int id){
        return memberRepository.findById(id);
    }
}
