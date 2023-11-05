package ru.sfedu.SysyemOfUniversityManagment.services.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sfedu.SysyemOfUniversityManagment.repositories.UserRepository;
import ru.sfedu.SysyemOfUniversityManagment.security.User;

import java.util.Optional;

@Service
public class UserDataService {
    @Autowired
    UserRepository userRepository;
    public Optional<User> findByUsername(String username){
        return Optional.ofNullable(userRepository.findByUsername(username));
    }
    public void save(User user){
        userRepository.save(user);
    }
    public void delete(Long id){
        userRepository.deleteById(id);
    }
}
