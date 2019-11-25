package net.talaatharb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mharb
 *
 */
@SpringBootApplication
public class WebApplication {

	/**
	 * Application entry point
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
