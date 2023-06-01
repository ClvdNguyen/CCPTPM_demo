package com.t3h.day1.model.book;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9115743387718033451L;
	
	public Integer id;
	public String name;
	public String desc;
	public String author;
	public Integer price;
	public String type;

}
