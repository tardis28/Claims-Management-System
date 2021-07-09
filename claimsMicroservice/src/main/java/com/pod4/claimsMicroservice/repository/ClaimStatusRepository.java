package com.pod4.claimsMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pod4.claimsMicroservice.model.ClaimStatus;

@Repository
public interface ClaimStatusRepository extends JpaRepository<ClaimStatus, Long> {

	@Query(value = "select * from claimstatus c where c.claim_Id = :claimId AND c.policy_Id = :policyId AND c.member_Id = :memberId",nativeQuery = true)
	public ClaimStatus getClaimStatus(@Param("claimId") long claimId, @Param("policyId") long policyId, @Param("memberId")long memberId);
	
	
}
