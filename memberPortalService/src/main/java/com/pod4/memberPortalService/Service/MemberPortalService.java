package com.pod4.memberPortalService.Service;


import org.springframework.stereotype.Service;

import com.pod4.memberPortalService.Model.MemberSubmitClaim;
@Service
public interface MemberPortalService {
	void memberSubmitClaim(MemberSubmitClaim memberSubmitClaim);

}