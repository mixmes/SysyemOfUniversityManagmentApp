package ru.sfedu.SysyemOfUniversityManagment.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.sfedu.SysyemOfUniversityManagment.model.Lection;

@Repository
public interface LectionRepository extends CrudRepository<Lection,Long> {
}
