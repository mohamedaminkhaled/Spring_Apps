package com.spring_test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


//@EnableWebMvc
//@Configuration
//@ComponentScan("com.spring_test")
//public class AppConfig implements WebMvcConfigurer {
//	
//	@Autowired
//	ApplicationContext applicationContext;
//	
//	@Bean
//	public ViewResolver viewResolver() {
//		InternalResourceViewResolver ivs = new InternalResourceViewResolver();
//		ivs.setPrefix("/WEB-INF/views/");
//		ivs.setSuffix(".jsp");
//		ivs.setOrder(0);
//		return ivs; 
//	}
//
//}
