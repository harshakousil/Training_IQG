package Practice.jwt.filter;

import Practice.jwt.service.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthFilter extends OncePerRequestFilter {
    @Autowired
    JWTService jwtService;
    @Override

    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String header=request.getHeader("Authorization");
        String token=null;
        String username=null;
        if(null != header && header.startsWith("Bearer ")){
            token =header.substring(7);
           username= jwtService.extractUsername(token);
        }
        if(null != username && SecurityContextHolder.getContext().getAuthentication() ==null){
            //Stopped Here
            System.out.println(username);

        }
    }
}
