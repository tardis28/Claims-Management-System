package com.pod4.claimsMicroservice.utility;

import lombok.Data;

@Data
public class ClaimStatusResult {
	private String claimStatus;
	private String claimDesc;
	private String ClaimId;
	private String memberId;

}
