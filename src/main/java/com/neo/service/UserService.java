package com.neo.service;

import com.neo.domain.User;

public interface UserService {
	public User login(User user);
	public boolean isEixts(User user);
	public boolean checkToken(String token);
	public String getToken(User user);
}
