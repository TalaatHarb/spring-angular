package net.talaatharb.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * API security configuration
 * @author mharb
 *
 */
@Configuration
@EnableWebSecurity
public class APISecurityConfiguration  extends WebSecurityConfigurerAdapter{

}
