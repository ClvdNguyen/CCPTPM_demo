package com.t3h.day1.model.book;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8908325563664369087L;

	public String name;
	public String desc;
	public String author;
	public Integer price;
	public String type;

}
