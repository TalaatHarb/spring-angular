package net.talaatharb.app.model;

import java.util.Random;

import org.springframework.stereotype.Component;

/**
 * Model object for testing
 * @author mharb
 *
 */
@Component
public class Resource {

	private static final Random RANDOM = new Random();

	private final Integer id;

	private final String txt;

	/**
	 * 
	 * @return The id of the resource
	 */
	public Integer getId() {
		return id;
	}

	/**
	 *
	 * @return The text inside the resource
	 */
	public String getTxt() {
		return txt;
	}

	/**
	 * Default constructor
	 */
	public Resource() {
		this(RANDOM.nextInt());
	}

	/**
	 * Full constructor
	 * @param id
	 * @param txt
	 */
	public Resource(Integer id, String txt) {
		this.id = id;
		this.txt = txt;
	}
	
	/**
	 * ID based constructor
	 * @param id
	 */
	public Resource(Integer id) {
		this(id, "Test String: " + id);
	}

}
