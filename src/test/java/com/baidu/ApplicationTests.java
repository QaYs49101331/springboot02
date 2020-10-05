package com.baidu;

import com.baidu.dao.UserMapper;
import com.baidu.pojo.Dog;
import com.baidu.pojo.Person;
import com.baidu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

	/**
	 *
	 */
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private Person person;
	@Test
	void contextLoads() {

		List<User> user = userMapper.findUserList();
		System.out.println(user);
	}

	@Test
	void contextLoads1() {
		
		System.out.println(person);

	}
}
