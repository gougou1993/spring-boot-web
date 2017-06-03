package com.neo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.domain.UserRole;
import com.neo.domain.UserRoleRepository;

@RestController
@RequestMapping("/userRole")
public class UserRoleController {

	@Autowired
	private UserRoleRepository userRoleRepository;
	
	@RequestMapping("/getUserRole")
	public  UserRole getUserRole(Long id){
		
		return userRoleRepository.findOne(id);
	}
}
