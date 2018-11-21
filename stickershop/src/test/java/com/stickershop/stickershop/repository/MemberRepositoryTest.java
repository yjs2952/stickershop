package com.stickershop.stickershop.repository;

import com.stickershop.stickershop.Repository.MemberRepository;
import com.stickershop.stickershop.domain.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class MemberRepositoryTest {

    @Autowired
    EntityManager entityManager;

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 모든_유저_목록_가져오기() throws Exception{
        Pageable pageable = PageRequest.of(0, 5);
        Page<Member> members = memberRepository.findAll(pageable);

        System.out.println(members.getTotalElements());
        System.out.println(members.getTotalPages());

        System.out.println("==========================");
        for (Member member : members) {
            System.out.println(member.getId());
            /*System.out.println(member.getUserId());*/
            System.out.println(member.getMemberName());
            System.out.println(member.getNickname());
            System.out.println(member.getEmail());
            System.out.println(member.getPhone());
            System.out.println("==========================");
        }
    }

    @Test
    public void 키워드로_유저_목록_검색() throws Exception {
        Pageable pageable = PageRequest.of(0, 5);
        Page<Member> members = memberRepository.findMembersByKeyword("spring", pageable);

        System.out.println(members.getTotalElements());
        System.out.println(members.getTotalPages());

        System.out.println("==========================");
        for (Member member : members) {
            System.out.println(member.getId());
            /*System.out.println(member.getUserId());*/
            System.out.println(member.getMemberName());
            System.out.println(member.getNickname());
            System.out.println(member.getEmail());
            System.out.println(member.getPhone());
            System.out.println(member.getOrderList().size());
            System.out.println(member.getRoles().size());
            System.out.println("==========================");
        }
    }

    @Test
    public void 이름으로_유저_목록과_권한_가져오기() throws Exception {

        Pageable pageable = PageRequest.of(0, 5);

        Page<Member> members = memberRepository.findMemberById("spring", pageable);

        System.out.println(members.getTotalElements());
        System.out.println(members.getTotalPages());

        System.out.println("==========================");
        for (Member member : members) {
            System.out.println(member.getId());
            System.out.println(member.getMemberName());
            System.out.println(member.getEmail());
            System.out.println(member.getPhone());
            System.out.println(member.getOrderList().size());
            System.out.println("==========================");
        }

       /* Member user1 = new Member();
        user1.setId("entity");
        user1.setAddress("우주 어딘가");
        user1.setEmail("asd11@gmail.com");
        user1.setMileage(1111);
        user1.setNickname("내지갑을아이어에");
        user1.setPassword("1234");
        user1.setUserName("계왕님");
        user1.setPhone("010-4321-9876");
        user1.setZipCode(19283);

        entityManager.persist(user1);

        user1.setZipCode(65432);
        entityManager.flush();*/
    }

    @Test
    public void 로그인_정보_가져오기() throws Exception {
        int result = memberRepository.findByIdAndPassword("spring", "1234");
        System.out.println("결과 : " + result);
    }

    @Test
    public void 아이디_찾기() throws Exception {
        String id = memberRepository.findIdByEmail("asd@naver.com");
        System.out.println("아이디 " +id);
    }

    @Test
    public void 패스워드_찾기() throws Exception{
        String pw = memberRepository.findPasswordByIdAndEmail("spring", "asd@naver.com");
        System.out.println("패스워드 : " + pw);
    }
}
