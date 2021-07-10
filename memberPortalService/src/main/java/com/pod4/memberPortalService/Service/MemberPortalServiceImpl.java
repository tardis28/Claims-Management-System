package com.pod4.memberPortalService.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pod4.memberPortalService.Model.MemberSubmitClaim;
import com.pod4.memberPortalService.Repository.PortalRepo;

@Service
public class MemberPortalServiceImpl implements MemberPortalService{
	
	@Autowired
	private PortalRepo repo;
	
	
	private static final String SUBMIT_CLAIM_API = "http://memberMicroservice/submitclaim";
	
	@Autowired
	private RestTemplate restTemp;

	@Override
	public void memberSubmitClaim(MemberSubmitClaim memberSubmitClaim) {
		restTemp.postForObject(SUBMIT_CLAIM_API, memberSubmitClaim, MemberSubmitClaim.class);	
	}

}
