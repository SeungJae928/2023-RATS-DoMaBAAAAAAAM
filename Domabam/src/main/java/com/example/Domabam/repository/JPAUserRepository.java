package com.example.Domabam.repository;

import com.example.Domabam.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPAUserRepository extends JpaRepository<User, Long> {
    public User findByName(String name);
}
