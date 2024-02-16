package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
	void userSignup(User user);
	boolean userLogin(String un, String pw);
	List<User> getAllUsers();
}
