package org.feixiang3cache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	@Autowired
	private OrderService orderService;

	public UserService(){
		System.out.println("UserService  constructor ");
	}

	public String getName(int userId) {
		return "getname : userService .......";
	}
}
