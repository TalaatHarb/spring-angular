/**
 * 
 */
package net.talaatharb.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author mharb
 *
 */
@Controller
public class HomeController {
	
	/**
	 * Mapping for the /home end point
	 * @return The contents of the page index.html
	 */
	@GetMapping(path = {"/home", "/index", "/site/**", "/login"})
	public String home() {
		return "forward:/index.html";
	}

}
