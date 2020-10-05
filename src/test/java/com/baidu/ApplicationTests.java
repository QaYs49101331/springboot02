package com.baidu;

import com.baidu.dao.UserMapper;
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
	@Test
	void contextLoads() {

		List<User> user = userMapper.findUserList();
		System.out.println(user);
	}

}
