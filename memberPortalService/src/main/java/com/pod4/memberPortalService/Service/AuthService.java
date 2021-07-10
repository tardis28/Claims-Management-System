package com.pod4.memberPortalService.Service;

import org.springframework.stereotype.Service;

@Service
public interface AuthService {

	String validateToken(String Token);
}