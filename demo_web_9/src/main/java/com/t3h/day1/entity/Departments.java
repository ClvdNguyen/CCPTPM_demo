package com.t3h.day1.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "departments")
@Data
public class Departments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String location;
	
	@Column
	private String code;
	
	@Column
	private Integer memberCnt;
	
//	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
//	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedAt;
	
	@ManyToOne
	@JoinColumn(name = "persion_in_charge") // thông qua khóa ngoại address_id
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private Users user;

}
