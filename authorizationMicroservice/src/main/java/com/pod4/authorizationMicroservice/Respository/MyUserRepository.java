package com.pod4.authorizationMicroservice.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pod4.authorizationMicroservice.Model.MyUser;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, String> {

	
}
