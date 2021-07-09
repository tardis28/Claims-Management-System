package com.pod4.policyMicroservice.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pod4.policyMicroservice.Model.ProviderPolicy;

@Repository
public interface PolicyProviderRepo extends JpaRepository<ProviderPolicy, Long> {

	@Query(value = "select * from provider_policy p where p.policy_Id = :policyId",nativeQuery = true)
	public ProviderPolicy getChainOfProviders(@Param("policyId") String policyId);

}
