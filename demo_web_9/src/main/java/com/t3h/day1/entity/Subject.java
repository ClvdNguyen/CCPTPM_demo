package com.t3h.day1.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "subjects")
@Data
public class Subject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6218191376729472445L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String subjectName;
	
	private String category;
	
	private Integer passPoint;
}
