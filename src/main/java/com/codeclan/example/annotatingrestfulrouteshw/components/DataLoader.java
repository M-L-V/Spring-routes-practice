package com.codeclan.example.annotatingrestfulrouteshw.components;

import com.codeclan.example.annotatingrestfulrouteshw.models.User;
import com.codeclan.example.annotatingrestfulrouteshw.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User user1 = new User("Sky");
        userRepository.save(user1);
    }
}

