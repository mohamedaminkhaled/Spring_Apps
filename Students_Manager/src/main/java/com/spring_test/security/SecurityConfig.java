//package com.spring_test.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
////@Configuration
////@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
////	@Autowired
////	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
////		auth.inMemoryAuthentication().withUser("Mohamed").password("12345").roles("user", "admin");
////	}
////	
////	@Override
////	protected void configure(HttpSecurity http) throws Exception {
////		http.authorizeRequests().antMatchers("/login").permitAll().antMatchers("/", "/*student*/**")
////		.access("hasRole('user')").and().formLogin();
////	}
//
//}
