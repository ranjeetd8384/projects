package com.practice.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.firstproject.model.User;

public interface firstpro extends JpaRepository<User , Integer> {
    
}
