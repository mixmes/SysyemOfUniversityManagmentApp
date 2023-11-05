package ru.sfedu.SysyemOfUniversityManagment.services.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sfedu.SysyemOfUniversityManagment.model.Lection;
import ru.sfedu.SysyemOfUniversityManagment.repositories.LectionRepository;

import java.util.Optional;

@Service
public class LectionDataService {
    @Autowired
    LectionRepository lectionRepository;
    public Optional<Lection> getLectionById(Long id){
        return lectionRepository.findById(id);
    }
    public void deleteById(Long id){
        lectionRepository.deleteById(id);
    }
    public void save(Lection lection){
        lectionRepository.save(lection);
    }
}
