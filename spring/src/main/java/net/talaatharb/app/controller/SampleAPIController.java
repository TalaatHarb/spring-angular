package net.talaatharb.app.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.talaatharb.app.model.Resource;

/**
 * 
 * @author mharb
 *
 */
@RestController
@RequestMapping(path = "/api")
public class SampleAPIController {

	/**
	 * 
	 * @param id
	 * @return The string
	 */
	@GetMapping(path = "/strings/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Resource getString(@PathVariable final Integer id) {
		return new Resource(id);
	}
}
