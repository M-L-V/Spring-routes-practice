package com.codeclan.example.annotatingrestfulrouteshw;

import com.codeclan.example.annotatingrestfulrouteshw.models.User;
import com.codeclan.example.annotatingrestfulrouteshw.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotatingRestfulRoutesHwApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUser(){
		User user1 = new User("Sky");
		userRepository.save(user1);
	}

}
