package com.example.demo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.api.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    @Query(value = "SELECT * FROM user_model WHERE email = ?1", nativeQuery = true)
    public UserModel findByEmail(String email);
}
