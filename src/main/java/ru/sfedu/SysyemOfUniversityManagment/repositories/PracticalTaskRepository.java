package ru.sfedu.SysyemOfUniversityManagment.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.sfedu.SysyemOfUniversityManagment.model.PracticalTask;
@Repository
public interface PracticalTaskRepository extends CrudRepository<PracticalTask,Long> {

}
