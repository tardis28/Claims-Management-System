package com.pod4.memberMicroservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pod4.memberMicroservice.Model.MemberClaim;

@Repository
public interface MemberSubmitClaimRepo extends JpaRepository<MemberClaim, Long>{

}