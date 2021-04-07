package org.feixiang.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

	public String getName(int userId) {
		return "abc";
	}

}
