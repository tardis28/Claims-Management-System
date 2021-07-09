package com.pod4.policyMicroservice.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pod4.policyMicroservice.Model.ProviderPolicy;
import com.pod4.policyMicroservice.Respository.PolicyProviderRepo;
import com.pod4.policyMicroservice.Service.PolicyService;
import com.pod4.policyMicroservice.Service.PolicyServiceImplementation;
import com.pod4.policyMicroservice.Util.EligiblClaimResponse;
import com.pod4.policyMicroservice.Util.ProviderResult;

@RestController
public class PolicyController {

	@Autowired
	private PolicyService policyService;

	@Autowired
	private PolicyProviderRepo policyProviderRepo;
	
	@Autowired
	private RestTemplate restTemp;
	
	
	//Save Details

	@PostMapping("/saveProvidersDetails")
	public ProviderPolicy saveProviderPolicy(@RequestBody ProviderPolicy providerPolicy) {
		return this.policyService.saveProviderPolicy(providerPolicy);

	}

	// /getChainOfProviders (Input: Policy_ID | Output (Provider List, location wise)
	@GetMapping("/getChainOfProviders/{policyId}")
	public ProviderResult getChainOfProviders(@PathVariable("policyId") String policyId) {

		ProviderPolicy newProviderPolicy = policyProviderRepo.getChainOfProviders(policyId);
		ProviderResult pResult = new ProviderResult();
		pResult.setProvider_Name(newProviderPolicy.getProviderName());
		pResult.setLocation(newProviderPolicy.getLocation());
		return pResult;

	}
	
	@GetMapping("/getdata/{policyId}")
	public EligiblClaimResponse getData(@PathVariable("policyId") String policyId) {

		ProviderPolicy newProviderPolicy = policyProviderRepo.getChainOfProviders(policyId);
		EligiblClaimResponse resp = new EligiblClaimResponse();
		resp.setPolicyName(newProviderPolicy.getPolicyName());
		resp.setTotalClaimedAmt(newProviderPolicy.getClaimAmt());
		return resp;

	}
	
	

}