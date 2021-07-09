package com.pod4.memberMicroservice.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.pod4.memberMicroservice.Model.*;

@Service
public interface MembersService {
	Members savaMembers(Members members);
	Members getMemberByid(long id) throws Exception;
	MemberPolicy saveMemberPolicy(MemberPolicy memberPolicy);
	List<MemberPolicy> ViewBill(long membId,long policyId);
	MemberSubmitClaim saveClaim(MemberSubmitClaim memberSubmitClaim);

}