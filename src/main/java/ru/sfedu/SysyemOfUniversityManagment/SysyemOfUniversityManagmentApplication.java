package ru.sfedu.SysyemOfUniversityManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.sfedu.SysyemOfUniversityManagment.security.User;
import ru.sfedu.SysyemOfUniversityManagment.services.data.UserDataService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableWebMvc
public class SysyemOfUniversityManagmentApplication {
	@Autowired
	UserDataService userDataService;

	public static void main(String[] args) {
		SpringApplication.run(SysyemOfUniversityManagmentApplication.class, args);
	}

	@Bean
	public CommandLineRunner CommandLineRunnerBean() {
		return (args) -> {

		};
	}

}
