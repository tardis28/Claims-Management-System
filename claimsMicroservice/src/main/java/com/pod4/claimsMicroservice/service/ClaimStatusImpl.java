package com.pod4.claimsMicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pod4.claimsMicroservice.DTO.MemberSubmitClaim;
import com.pod4.claimsMicroservice.DTO.ProviderPolicy;
import com.pod4.claimsMicroservice.DTO.ProviderPolicyBenefit;
import com.pod4.claimsMicroservice.model.ClaimStatus;
import com.pod4.claimsMicroservice.repository.ClaimStatusRepository;

@Service
public class ClaimStatusImpl implements ClaimService {

	@Autowired
	private ClaimStatusRepository claimStatusRepo;

	@Override
	public ClaimStatus updateStatus(ClaimStatus claimStatus) {
		return this.claimStatusRepo.save(claimStatus);
	}

}
