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

    Page<User> findById(String id, Pageable pageable);

    @Query(value = "select u from User u where u.id like CONCAT('%', :keyword, '%') or u.userName like CONCAT('%', :keyword, '%') or u.nickname like CONCAT('%', :keyword, '%')")
    Page<User> findUsersByKeyword(@Param("keyword") String keyword, Pageable pageable);

    @Query(value = "SELECT u FROM User u JOIN u.roles WHERE u.id = :id")
    Page<User> findUserAndRoleById(@Param("id") String id, Pageable pageable);

}
