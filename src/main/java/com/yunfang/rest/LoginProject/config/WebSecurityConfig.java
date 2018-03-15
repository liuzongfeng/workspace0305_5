package com.yunfang.rest.LoginProject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Value("${server.servlet-path}")
    String servletPath;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);

        http.authorizeRequests()
                .antMatchers("/**/css/**","/**/plugins/**","/**/Images/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .headers().frameOptions().disable()
                .and()
                .formLogin()
                    .loginPage(servletPath+"/login.html")
                    .usernameParameter("userName")
                    .passwordParameter("password")
                    .loginProcessingUrl(servletPath+"/login")
                    .defaultSuccessUrl(servletPath+"/pages/index.html")
                    .permitAll()
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable();
    }

    @Autowired
    private  MyUserDetailsService myUserDetailsService;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth);
        auth.userDetailsService(myUserDetailsService);
    }
}
