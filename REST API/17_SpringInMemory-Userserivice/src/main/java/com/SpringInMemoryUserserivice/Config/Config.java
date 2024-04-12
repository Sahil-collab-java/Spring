package com.SpringInMemoryUserserivice.Config;


import com.SpringInMemoryUserserivice.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Config {
	
	
//	@Bean
//	public InMemoryUserDetailsManager  inMemoryUserDetailsManager()  {
//
//		UserDetails adminDetails = User.withDefaultPasswordEncoder().
//		                                 username("sahil").
//		                                 password("sahil@123").
//		                                 authorities("ADMIN").
//		                                 build();
//
//		UserDetails userdetails = User.withDefaultPasswordEncoder().
//                username("sahil1").
//                password("sahil@123").
//                authorities("USER").
//                build();
//
//		return new InMemoryUserDetailsManager(adminDetails,userdetails);
//	}



	@Autowired
	private MyUserDetailsService myUserDetailsService;

	@Autowired
	public  void setMyUserDetailsService(AuthenticationManagerBuilder builder) throws Exception{
		builder.userDetailsService(myUserDetailsService).
				passwordEncoder(NoOpPasswordEncoder.getInstance());
	}


	@Bean
	public SecurityFilterChain filterChain (HttpSecurity http) throws Exception{
		http.authorizeHttpRequests((req)-> req.
				requestMatchers("/contact").
				permitAll().
				anyRequest().
				authenticated()).formLogin(Customizer.withDefaults())
				.httpBasic(Customizer.withDefaults());

		return http.build();


	}

}
