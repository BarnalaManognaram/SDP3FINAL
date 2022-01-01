package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CheckNowRepo extends CrudRepository<CheckNow, String> {
   
    public CheckNow findByEmail(String email);
    
}