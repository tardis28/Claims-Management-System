package com.pod4.claimsMicroservice.service;

import org.springframework.stereotype.Service;

//import com.pod4.claimsMicroservice.DTO.MemberSubmitClaim;
//import com.pod4.claimsMicroservice.DTO.ProviderPolicy;
//import com.pod4.claimsMicroservice.DTO.ProviderPolicyBenefit;
import com.pod4.claimsMicroservice.model.ClaimStatus;

@Service
public interface ClaimService {
	ClaimStatus updateStatus(ClaimStatus claimStatus);
//	ProviderPolicy getProviderPolicy(String policyId);
//	ProviderPolicyBenefit getProviderPolicyBenefit(String benefit);
//	MemberSubmitClaim getMemberSubmitClaim(String policyId);
	

}
