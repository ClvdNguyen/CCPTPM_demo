package com.t3h.day1.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "users")
@Data
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column
	@JsonIgnore
	private String password;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String title;
	
	@Column
	private String phoneNumber;
	
	@Column(name = "parent_id")
	private Long parentId;
	
	@Column
	private Integer age;
	
//	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
//	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedAt;
	
//	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLoginTime;
	
//	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date deletedAt;
	
	

}
