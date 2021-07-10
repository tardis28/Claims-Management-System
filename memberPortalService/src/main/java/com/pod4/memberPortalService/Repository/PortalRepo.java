package com.pod4.memberPortalService.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pod4.memberPortalService.Model.MemberSubmitClaim;

@Repository
public interface PortalRepo extends JpaRepository<MemberSubmitClaim, Long>{

}
