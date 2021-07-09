package com.pod4.memberMicroservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpClientErrorException.BadRequest;
import org.springframework.web.client.RestTemplate;

import com.pod4.memberMicroservice.Model.*;

import com.pod4.memberMicroservice.Exception.TokenValidationFailedException;
import com.pod4.memberMicroservice.Repository.MembersPolicyRepo;
import com.pod4.memberMicroservice.Service.MembersService;

@RestController
public class MemberController {

	@Autowired
	private MembersService membersService;

	@Autowired
	private MembersPolicyRepo membersPolicyRepository;

	@Autowired
	private RestTemplate restTemp;

	@PostMapping("/savememb")
	public Members getMemberdetails(@RequestBody Members members) {
		return this.membersService.savaMembers(members);

	}

	@GetMapping("/viewbill/{membId}/{policyId}")
	public List<MemberPolicy> viewBill(@PathVariable("membId") String membid,
			@PathVariable("policyId") String policyId) {
		return this.membersPolicyRepository.viewbill(membid, policyId);

	}

	@PostMapping("/submitclaim")
	public MemberClaim submitClaim(@RequestBody MemberClaim memberSubmitClaim) {
		return this.membersService.saveClaim(memberSubmitClaim);

	}


	@GetMapping("/getClaimStatus/{claimId}/{policyId}/{memberId}")
	public ClaimStatusResult getClaimStatus(@PathVariable("claimId") long claimId,
			@PathVariable("policyId") long policyId, @PathVariable("memberId") long memberId) {
		ClaimStatusResult result = restTemp.getForObject(
				"http://claimservice/getClaimStatus/" + claimId + "/" + policyId + "/" + memberId,
				ClaimStatusResult.class);
		return result;

	}

}
