package com.neo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.domain.User;
import com.neo.domain.UserRepository;
import com.neo.properties.ImTokenProperties;
import com.neo.service.UserService;
import com.neo.util.NeoProperties;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserService userService;
	
	@Autowired
	private NeoProperties neoProperties;
	@Autowired
	private ImTokenProperties im;
    @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    public User getUser(User user) {
    	//User db_user=userRepository.findByUserName("aa");
    	User db_user = userService.login(user);
    	System.out.println(neoProperties.getDescription());
    	System.out.println(im.getAppName());
    	//User user=userRepository.findByName("aa");
    	System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
        return db_user;
    }
    
    @RequestMapping("/getUsers")
    @Cacheable(value="key-Users")
    public List<User> getUsers() {
    	List<User> users=userRepository.findAll();
    	System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
        return users;
    }
    
    
    @RequestMapping("/test")
    public String putCache(User user) {
        //userRepository.findOne(user.getId());
        User db_user = userService.login(user);
    	//System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
        return "ok";
    }
    @RequestMapping("/test2")
    public String testCache(User user) {
    	User db_user = userService.login(user);
    	//System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
    	//System.out.println(db_user.toString());
        return "ok";
    }
    
}