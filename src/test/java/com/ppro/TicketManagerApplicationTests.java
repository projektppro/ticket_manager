package com.ppro;

import com.ppro.persistence.user.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration
public class TicketManagerApplicationTests {


	@Autowired
	private UserServiceImpl userService;

	@Test
	public void contextLoads() {
	}

}
