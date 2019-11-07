package net.talaatharb.app.model;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Resource {

	private static final Random RANDOM = new Random();

	private final Integer id;

	private final String txt;

	public Integer getId() {
		return id;
	}

	public String getTxt() {
		return txt;
	}

	public Resource() {
		this(RANDOM.nextInt());
	}

	public Resource(Integer id, String txt) {
		this.id = id;
		this.txt = txt;
	}
	
	public Resource(Integer id) {
		this(id, "Test String: " + id);
	}

}
