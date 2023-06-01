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

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "projects")
@Data
public class Projects {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String name;

	@Column(name = "`desc`")
	private String desc;

	@Column
	private Integer memberCnt;

	@ManyToOne
	@JoinColumn(name = "person_in_charge") // thông qua khóa ngoại address_id
//	@EqualsAndHashCode.Exclude
//	@ToString.Exclude
	private Users user;

	@ManyToOne
	@JoinColumn(name = "department_id") // thông qua khóa ngoại address_id
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private Departments dept;
	
	
//	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
//	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedAt;
}
