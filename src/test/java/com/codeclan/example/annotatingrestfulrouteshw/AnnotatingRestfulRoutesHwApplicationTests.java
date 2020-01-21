package com.codeclan.example.annotatingrestfulrouteshw;

import com.codeclan.example.annotatingrestfulrouteshw.models.Folder;
import com.codeclan.example.annotatingrestfulrouteshw.models.User;
import com.codeclan.example.annotatingrestfulrouteshw.models.File;
import com.codeclan.example.annotatingrestfulrouteshw.repositories.FileRepository;
import com.codeclan.example.annotatingrestfulrouteshw.repositories.FolderRepository;
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

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFoldersAndUser(){
		User user = new User("Sky");
		userRepository.save(user);

		Folder folder = new Folder("Java Practice", user);
		folderRepository.save(folder);
	}


}
