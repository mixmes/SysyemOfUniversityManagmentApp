package ru.sfedu.SysyemOfUniversityManagment.config;


import jakarta.servlet.FilterChain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import ru.sfedu.SysyemOfUniversityManagment.security.AuthenticationService;

@Configuration
@EnableWebSecurity
@ComponentScan("ru.sfedu")
public class SecurityConfig  {
    @Autowired
    private AuthenticationService authProvider;

    @Bean
    public AuthenticationManager authManager(HttpSecurity http) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder =
                http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.authenticationProvider(authProvider);
        return authenticationManagerBuilder.build();
    }

    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests().requestMatchers("/h1","/taskform","/tasks").authenticated().and()
                .formLogin()
                .loginPage("/login").permitAll().and().authorizeHttpRequests().requestMatchers("/test/teacher").permitAll();
        return http.build();
    }
}