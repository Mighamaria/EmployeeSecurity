package com.ust.EmployeeSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
public class SpringSecurityConfig  extends WebSecurityConfigurerAdapter{
	 protected void config(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("Migha").password("Ust123").roles("ADMIN");	
		auth.inMemoryAuthentication().withUser("Migha1").password("Ust@123").roles("USER");
	}
//protected void configure(HttpSecurity http)throws Exception{
//	http.csrf().disable();
//	http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
//}
	 @Override
protected void configure(HttpSecurity http)throws Exception{
	http.csrf().disable();
	http.authorizeRequests().antMatchers("/rest/**").hasAnyRole("ADMIN")
	.anyRequest().fullyAuthenticated().and().httpBasic();
}
@Bean
public static NoOpPasswordEncoder passwordEncoder() {
	return (NoOpPasswordEncoder)NoOpPasswordEncoder.getInstance();
}
}
