package com.mhaque.json.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Event {

	private String name;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date eventDate;

	public Event(String name, Date eventDate) {
		this.name = name;
		this.eventDate = eventDate;
	}
}
