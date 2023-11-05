package ru.sfedu.SysyemOfUniversityManagment.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.sfedu.SysyemOfUniversityManagment.model.EducationalMaterial;

@Repository
public interface EducationalMaterialRepository extends CrudRepository<EducationalMaterial,Long> {
}
