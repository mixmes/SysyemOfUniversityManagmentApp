package ru.sfedu.SysyemOfUniversityManagment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.sfedu.SysyemOfUniversityManagment.security.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
