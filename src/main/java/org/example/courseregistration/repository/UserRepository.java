package org.example.courseregistration.repository;

import org.example.courseregistration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    User findByUsername(String username);

    List<User> findAllByOrderByUsernameAsc();

    boolean existsByUsername(String username);
}