package net.talaatharb.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
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
}
