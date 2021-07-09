package com.pod4.memberMicroservice.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pod4.memberMicroservice.Model.MemberPolicy;

@Repository
public interface MembersPolicyRepo extends JpaRepository<MemberPolicy, Long>{
	
	@Query(value = "select * from member_policy mp where mp.member_id = ?1 AND mp.policy_Id = ?2",nativeQuery = true)
	public List<MemberPolicy> viewbill(String membId,String policyId);

}