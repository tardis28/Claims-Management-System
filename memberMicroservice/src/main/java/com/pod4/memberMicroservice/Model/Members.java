package com.pod4.memberMicroservice.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "members")
public class Members {

	@Id
	private long memberId;
	
	@Column(name="name")
	private String Name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "dob")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date dob;

	@Column(name = "policy_Code")
	private String policyId;
	
	@Column(name = "address")
	private String address;
	
}
