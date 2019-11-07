/**
 * 
 */
package net.talaatharb.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Swathi
 *
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	
	/**
	 * Mapping for the /home end point
	 * @return The contents of the page index.html
	 */
	@GetMapping
	public String home() {
		return "forward:/index.html";
	}

}
