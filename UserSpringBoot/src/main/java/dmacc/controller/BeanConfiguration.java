package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.model.User;
import dmacc.model.UserItem;
@Configuration
public class BeanConfiguration {
	@Bean
	public User user() {
		User bean = new User();
		bean.setName("Laura");
		bean.setCountry("Colombia");
		bean.setEmail("lauramejiat16@gmail.com");
		return bean;
	}
	@Bean
	public UserItem useritem() {
		UserItem bean = new UserItem();
		bean.setId(1);
		bean.setOccupation("Interpreter");
		bean.setMajor("Engineering");
		bean.setId(3);
		bean.setOccupation("Constructor");
		bean.setMajor("Medicine");
		return bean;
	}
}
