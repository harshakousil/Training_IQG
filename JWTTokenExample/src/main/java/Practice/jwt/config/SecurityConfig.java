package  Practice.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
  //creting a role based authentication function
    @Bean
    public UserDetailsService userDetailsService( PasswordEncoder encoder)
    {
        UserDetails author = User.withUsername("Author1").password(encoder.encode("Author123")).roles("Author").build();
        UserDetails user = User.withUsername("user@gmail.com").password(encoder.encode("User123")).roles("User").build();
        return  new InMemoryUserDetailsManager(author, user);
    }
    //code for password encoding
    @Bean
    public PasswordEncoder passwordEncoder()
    {

        return  new BCryptPasswordEncoder();
    }


    //
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable().authorizeHttpRequests().antMatchers("/","/user/authenticate").permitAll()
                .and()
                .authorizeHttpRequests().antMatchers("/login","/post/**").authenticated().and().formLogin().and().build();

    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }


}
