package com.pod4.policyMicroservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pod4.policyMicroservice.Model.ProviderPolicy;
import com.pod4.policyMicroservice.Respository.PolicyProviderRepo;

@Service
public class PolicyServiceImplementation implements PolicyService {

	@Autowired
	private PolicyProviderRepo policyProviderRepo;

	@Override
	public ProviderPolicy saveProviderPolicy(ProviderPolicy providerPolicy) {

		return policyProviderRepo.save(providerPolicy);
	}

}