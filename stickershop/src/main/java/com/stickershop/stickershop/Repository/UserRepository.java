package com.stickershop.stickershop.Repository;

import com.stickershop.stickershop.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * 유저 아이디, 유저 명, 유저 닉네임으로 검색
 */
public interface UserRepository extends JpaRepository<User, String> {

    Page<User> findAll(Pageable pageable);

    @Query(value = "select u from User u where u.id like CONCAT('%', :keyword, '%') or u.userName like CONCAT('%', :keyword, '%') or u.nickname like CONCAT('%', :keyword, '%')")
    Page<User> findUsersByKeyword(@Param("keyword") String keyword, Pageable pageable);

    @Query(value = "SELECT u FROM User u JOIN FETCH u.roles JOIN FETCH u.grade WHERE u.id = :id",
            countQuery = "SELECT COUNT(u) FROM User u WHERE u.id = :id")
    Page<User> findUserById(@Param("id") String id, Pageable pageable);

    @Query(value = "SELECT COUNT(u) FROM User u WHERE u.id = :id AND u.password = :pw")
    int findByIdAndPassword(@Param("id") String id, @Param("pw") String pw);

    @Query(value = "SELECT u.id FROM User u WHERE u.email = :email")
    String findIdByEmail(@Param("email") String email);

    @Query(value = "SELECT u.password FROM User u WHERE u.id = :id AND u.email = :email")
    String findPasswordByIdAndEmail(@Param("id") String id, @Param("email") String email);

}
