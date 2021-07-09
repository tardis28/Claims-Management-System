package com.pod4.policyMicroservice.Service;


import org.springframework.stereotype.Service;

import com.pod4.policyMicroservice.Model.ProviderPolicy;

@Service
public interface PolicyService {
	
	ProviderPolicy saveProviderPolicy(ProviderPolicy providerPolicy);

}