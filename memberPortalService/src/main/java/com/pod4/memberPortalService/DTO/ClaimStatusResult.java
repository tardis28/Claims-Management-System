package com.pod4.memberPortalService.DTO;


import lombok.Data;

@Data
public class ClaimStatusResult {
	private String claimStatus;
	private String claimDesc;
	private Long ClaimId;
	private String memberId;

}