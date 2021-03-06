package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository
        extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM users WHERE age = ?1", nativeQuery = true)
    List<User> findAllByAge(int age);

}