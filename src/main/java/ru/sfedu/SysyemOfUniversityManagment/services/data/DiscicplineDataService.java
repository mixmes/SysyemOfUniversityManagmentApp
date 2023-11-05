package ru.sfedu.SysyemOfUniversityManagment.services.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sfedu.SysyemOfUniversityManagment.model.Discipline;
import ru.sfedu.SysyemOfUniversityManagment.repositories.DisciplineRepository;

import java.util.Optional;

@Service
public class DiscicplineDataService {
    @Autowired
    DisciplineRepository disciplineRepository;
    public void save(Discipline discipline){
        disciplineRepository.save(discipline);
    }
    public Optional<Discipline> getDisciplineById(Long id){
        return disciplineRepository.findById(id);
    }
    public void deleteDiscipline(Long id){
        disciplineRepository.deleteById(id);
    }
}
