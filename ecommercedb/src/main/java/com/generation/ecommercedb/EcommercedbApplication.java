package com.generation.ecommercedb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.generation.ecommercedb.jwt.config.JwtFilter;

@SpringBootApplication
public class EcommercedbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommercedbApplication.class, args);
	} // main
	@Bean
	public FilterRegistrationBean<JwtFilter> jwtFilter() {
		FilterRegistrationBean<JwtFilter> registrationBean =
				new FilterRegistrationBean<>();	
		registrationBean.setFilter( new JwtFilter());
		registrationBean.addUrlPatterns("/api/user/*");
	    registrationBean.addUrlPatterns("/api/productos/*");
		return registrationBean;
	} // jwtFilter

}
