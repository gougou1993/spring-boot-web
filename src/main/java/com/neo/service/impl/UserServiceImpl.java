package com.neo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.neo.domain.User;
import com.neo.domain.UserRepository;
import com.neo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Cacheable(value="usercache",keyGenerator="keyGenerator")
	@Override
	public User login(User user) {
		System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
		User db_user = userRepository.findOne(user.getId());
		if(db_user !=null && db_user.getPassWord().equals(user.getPassWord())){
			return db_user;
		}
		return null;
	}
	
	@Override
	public boolean isEixts(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean checkToken(String token) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String getToken(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
