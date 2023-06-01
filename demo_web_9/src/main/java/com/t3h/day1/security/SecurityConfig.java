package com.t3h.day1.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(jsr250Enabled = true, securedEnabled = true, prePostEnabled = true)
public class SecurityConfig {

	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user = User.withDefaultPasswordEncoder().username("user").password("user").roles("USER").build();
		UserDetails admin = User.withDefaultPasswordEncoder().username("admin").password("admin").roles("ADMIN")
				.build();
		return new InMemoryUserDetailsManager(user, admin);
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	    http
	    .csrf()
	      .disable()
	      .authorizeRequests()
	      
	      .antMatchers("/book/**")
	      .hasAnyRole("ADMIN")
	      .antMatchers("/project/**")
	      .hasAnyRole("USER", "ADMIN")
	      
	      .antMatchers("/admin")
	      .hasRole("ADMIN")
	      
	      .antMatchers("/user")
	      .hasAnyRole("USER", "ADMIN")
	      .antMatchers("/login*")
          .permitAll()
//	      .and()
//	      .httpBasic()
	      .and()
          .formLogin() 
          	.defaultSuccessUrl("/home")
          	.permitAll() 
          .and()
          .logout() 
          	.permitAll()
	      
//	      .and()
//	      .sessionManagement()
//	      .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
;
	    return http.build();
	}
}
