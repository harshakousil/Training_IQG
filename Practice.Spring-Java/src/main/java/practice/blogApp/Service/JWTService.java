package practice.blogApp.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JWTService {

    public String generateToken(String userName)
    {
        Map<String, Object> claims =new HashMap<>();
        return createToken(claims,userName);
    }

    private String createToken(Map<String, Object> claims, String userName) {
        return Jwts.builder().setClaims(claims)
                .setSubject(userName)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
                .signWith(getSecKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    private Key getSecKey() {
        byte[] key=Decoders.BASE64.decode("pda80arIqj30tygn8WOEMTWsm3xWddZA");
        return Keys.hmacShaKeyFor(key);
    }

}
