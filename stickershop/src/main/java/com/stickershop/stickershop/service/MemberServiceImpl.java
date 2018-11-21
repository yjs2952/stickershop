package com.stickershop.stickershop.service;

import com.stickershop.stickershop.Repository.MemberRepository;
import com.stickershop.stickershop.domain.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;

    MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member getMember(String id) {
        return memberRepository.getOne(id);
    }
}
