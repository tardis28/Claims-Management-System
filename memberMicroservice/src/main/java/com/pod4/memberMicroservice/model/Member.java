package com.pod4.memberMicroservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * This is a model class which we will be storing member details in the
 * database..
 * 
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Member {
	@Id
	private int memberId;// id of the member
	private String memberName;//name of the member
	private String phoneNumber;//phonenum of a member
	private int salary;//salary of a member
	private String gender;//gender of a member
}