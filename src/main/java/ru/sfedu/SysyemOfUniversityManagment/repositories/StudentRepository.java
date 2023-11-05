package ru.sfedu.SysyemOfUniversityManagment.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.sfedu.SysyemOfUniversityManagment.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
}
