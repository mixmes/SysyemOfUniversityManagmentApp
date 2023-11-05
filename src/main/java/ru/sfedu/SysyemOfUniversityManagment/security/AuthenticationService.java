package ru.sfedu.SysyemOfUniversityManagment.security;

import jakarta.security.auth.message.config.AuthConfigProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.sfedu.SysyemOfUniversityManagment.exceptions.NoSuchUser;
import ru.sfedu.SysyemOfUniversityManagment.services.data.UserDataService;

import java.util.Optional;
@Service
@Slf4j
public class AuthenticationService implements AuthenticationProvider {
    @Autowired
    UserDataService userDataService;
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    @Override
    public Authentication authenticate(Authentication authentication) {
        log.info("Starting auth ");
        Optional<User> user = userDataService.findByUsername(authentication.getPrincipal().toString());
        if(user.isEmpty()){
           throw new NoSuchUser("No such user with this username");
        }
        if(!encoder.matches(authentication.getCredentials().toString(),user.get().getPassword())){
           throw new BadCredentialsException("Bad credentials");
        }
        return new UsernamePasswordAuthenticationToken(user.get().getUsername(),user.get().getPassword(),user.get().getAuthorities());

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
