package ru.sfedu.SysyemOfUniversityManagment.services.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sfedu.SysyemOfUniversityManagment.model.StudentGroup;
import ru.sfedu.SysyemOfUniversityManagment.repositories.StudentGroupRepository;

import java.util.Optional;

@Service
public class StudentGroupDataService {
    @Autowired
    StudentGroupRepository studentGroupRepository;
    public void save(StudentGroup studentGroup){
        studentGroupRepository.save(studentGroup);
    }
    public Optional<StudentGroup> getById(Long id){
        return studentGroupRepository.findById(id);
    }
    public void delete(Long id){
        studentGroupRepository.deleteById(id);
    }
}
