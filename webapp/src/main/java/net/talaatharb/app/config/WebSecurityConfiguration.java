package net.talaatharb.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * Security configuration
 * 
 * @author mharb
 *
 */
@Order(value = 99)
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends APISecurityConfiguration {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests() // Configuration for authorization of requests
				.antMatchers("/api/**").authenticated() // API end points
				.antMatchers("/index").permitAll() // UI framework end point(Angular)
				.and().formLogin() // Form Login
				.loginPage("/login") // To force Login through UI framework(Angular)
				.permitAll(); // To Allow access to login page
	}
}
