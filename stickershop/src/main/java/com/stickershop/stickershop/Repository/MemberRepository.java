package com.stickershop.stickershop.Repository;

import com.stickershop.stickershop.domain.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * 유저 아이디, 유저 명, 유저 닉네임으로 검색
 */
public interface MemberRepository extends JpaRepository<Member, String> {

    Page<Member> findAll(Pageable pageable);

    @Query(value = "select m from Member m where m.id like CONCAT('%', :keyword, '%') or m.memberName like CONCAT('%', :keyword, '%') or m.nickname like CONCAT('%', :keyword, '%')")
    Page<Member> findMembersByKeyword(@Param("keyword") String keyword, Pageable pageable);

    @Query(value = "SELECT m FROM Member m JOIN FETCH m.roles JOIN FETCH m.grade WHERE m.id = :id",
            countQuery = "SELECT COUNT(u) FROM Member u WHERE u.id = :id")
    Page<Member> findMemberById(@Param("id") String id, Pageable pageable);

    @Query(value = "SELECT COUNT(m) FROM Member m WHERE m.id = :id AND m.password = :pw")
    int findByIdAndPassword(@Param("id") String id, @Param("pw") String pw);

    @Query(value = "SELECT m.id FROM Member m WHERE m.email = :email")
    String findIdByEmail(@Param("email") String email);

    @Query(value = "SELECT m.password FROM Member m WHERE m.id = :id AND m.email = :email")
    String findPasswordByIdAndEmail(@Param("id") String id, @Param("email") String email);

}
