package ru.sfedu.SysyemOfUniversityManagment.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.sfedu.SysyemOfUniversityManagment.model.StudentGroup;

@Repository
public interface StudentGroupRepository extends CrudRepository<StudentGroup,Long> {
}
