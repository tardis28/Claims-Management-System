package com.pod4.claimsMicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pod4.claimsMicroservice.model.ClaimStatus;
import com.pod4.claimsMicroservice.repository.ClaimStatusRepository;
import com.pod4.claimsMicroservice.service.ClaimService;
import com.pod4.claimsMicroservice.utility.ClaimStatusResult;

import lombok.Data;

@RestController
public class ClaimController {

	@Autowired
	private ClaimService claimService;

	@Autowired
	private ClaimStatusRepository claimStatusRepo;

	// This method is to Submit  the Claim Status
	@PostMapping("/submitClaimStatus")
	public ClaimStatus SubmitClaimStatus(@RequestBody ClaimStatus claimStatus) {
		return this.claimService.updateStatus(claimStatus);

	}

//	This method will return the status of a claim based on the policy, member and his claim id
	@GetMapping("/getClaimStatus/{claimId}/{policyId}/{memberId}")
	public ClaimStatusResult getClaimStatus(@PathVariable("claimId") long claimId,
			@PathVariable("policyId") long policyId, @PathVariable("memberId") long memberId) {
		ClaimStatus newclaimClaimStatus = claimStatusRepo.getClaimStatus(claimId, policyId, memberId); // select * ka
																										// content
		ClaimStatusResult claimStatusResult = new ClaimStatusResult();
		claimStatusResult.setClaimId(newclaimClaimStatus.getClaimId());
		claimStatusResult.setMemberId(newclaimClaimStatus.getMemberId());
		claimStatusResult.setClaimStatus(newclaimClaimStatus.getClaimStatus());
		claimStatusResult.setClaimDesc(newclaimClaimStatus.getStatusDes());
		int val=0;
		return claimStatusResult;
	}

}