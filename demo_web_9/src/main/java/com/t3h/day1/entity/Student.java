package com.t3h.day1.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "student")
@Data
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	// math_point
	@Column(name = "m_point")
	private Integer mathPoint = 0;

	@Column(name = "created_at")
	@Temporal(value = TemporalType.DATE)
	private Date createdDate;

//	@OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
//	@ToString.Exclude
//	private Set<User> users;
}
