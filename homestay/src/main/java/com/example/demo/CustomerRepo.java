package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<User, String> {
   
    public User findByEmail(String email);
    
}