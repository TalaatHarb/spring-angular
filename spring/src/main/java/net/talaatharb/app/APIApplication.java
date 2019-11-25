package net.talaatharb.app;
/**
 * 
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author mharb
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
public class APIApplication extends SpringBootServletInitializer{

	/**
	 * Application entry point
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(APIApplication.class, args);
	}

}
