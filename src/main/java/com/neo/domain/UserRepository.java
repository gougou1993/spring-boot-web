package com.neo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);
    //User findByName(String name);
    User findByUserNameOrEmail(String username, String email);
    //User findByNameAndPwd(String name, String pwd);
    
}