package com.pod4.policyMicroservice.Util;

import lombok.Data;

@Data
public class EligiblClaimResponse {

	private String policyName;
	private long totalClaimedAmt; 
}
