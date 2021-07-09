package com.pod4.memberMicroservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pod4.memberMicroservice.Model.Members;

@Repository
public interface MemberRepo extends JpaRepository<Members, Long>{

}
