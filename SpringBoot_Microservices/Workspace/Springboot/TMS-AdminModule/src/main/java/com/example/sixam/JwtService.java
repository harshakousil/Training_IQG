package com.example.sixam;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
@Component
public class JwtService {

	
	public String generateToken(String username){
		Map<String, Object> claims = new HashMap<>();
		
		return createToken(claims, username);
				
	}

	private String createToken(Map<String, Object> claims, String username) {
		// TODO Auto-generated method stub
	return Jwts.builder()
			.setClaims(claims)
			.setSubject(username)
			.setIssuedAt(new Date(System.currentTimeMillis()))
			.setExpiration(new Date(System.currentTimeMillis()+1000*60*60))
			.signWith(getSeckey(),SignatureAlgorithm.HS256).compact();
}

	private Key getSeckey() {
		// TODO Auto-generated method stub
		byte[] keybytes =Decoders.BASE64.decode("5742880bb9c85a2cf2effc2a72dedf485936d1dae3b16d88faa0536bbdd37133");
		return Keys.hmacShaKeyFor(keybytes);
	}
}
