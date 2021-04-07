package org.feixiang3cache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

	@Autowired
	private UserService userService;

	public OrderService(){
		System.out.println("OrderService constructor  ");
	}

	public String getOrderName(int orderId) {
		return "..........getOrderName :" + orderId;
	}
}
