package com.pod4.memberMicroservice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pod4.memberMicroservice.Model.*;
import com.pod4.memberMicroservice.Repository.*;

@Service
public class MembersServiceImpl implements MembersService {

	@Autowired
	private MemberRepo memberRepo;

	@Autowired
	private MembersPolicyRepo membersPolicyRepo;

	@Autowired
	private MemberSubmitClaimRepo memberSubmitClaimRepo;

	@Override
	public Members savaMembers(Members members) {
		return this.memberRepo.save(members);
	}

	@Override
	public Members getMemberByid(long id) throws Exception {
		Optional<Members> optional = memberRepo.findById(id);
		Members members = null;
		if (optional.isPresent()) {
			members = optional.get();
		} else {
			throw new Exception();
		}
		return members;
	}

	@Override
	public MemberPolicy saveMemberPolicy(MemberPolicy memberPolicy) {

		return this.membersPolicyRepo.save(memberPolicy);
	}

	@Override
	public List<MemberPolicy> ViewBill(long membId, long policyId) {

		return null;

	}

	@Override
	public MemberClaim saveClaim(MemberClaim memberSubmitClaim) {
		return this.memberSubmitClaimRepo.save(memberSubmitClaim);
	}

}