package com.pod4.memberMicroservice.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "member_claim")
public class MemberClaim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long claimsId;
	
	@Column(name = "policy_Id")
	private String policyId;
	
	@Column(name = "member_Id")
	private String memberId;
	
	@Column(name = "hospital_Id")
	private String hospitalId;
	
	@Column(name = "total_Bill")
	private long totalBill;
	
	@Column(name = "totalClaimed_Amt")
	private long totalClaimedAmt;
}
