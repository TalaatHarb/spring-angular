package net.talaatharb.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * API security configuration
 * 
 * @author mharb
 *
 */
@Configuration
@EnableWebSecurity
public class APISecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests() // Configuration for authorization of requests
				.antMatchers("/api/**").authenticated() // API end points
				.and().formLogin().permitAll();
	}
}
