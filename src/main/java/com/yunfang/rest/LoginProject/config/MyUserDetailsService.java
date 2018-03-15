package com.yunfang.rest.LoginProject.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


@Component
public class MyUserDetailsService implements UserDetailsService{

    @Override

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //1.查询用户数据

        //2.查询权限
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("role_root"));
        //3.构造用户信息
        System.out.print("===========================================5==================");

        User user = new User("root","123456",true,true,true,true,authorities);

        return user;

    }

}
