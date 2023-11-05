package ru.sfedu.SysyemOfUniversityManagment.services.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sfedu.SysyemOfUniversityManagment.model.Teacher;
import ru.sfedu.SysyemOfUniversityManagment.repositories.TeacherRepository;

import java.util.Optional;

@Service
public class TeacherDataService {
    @Autowired
    TeacherRepository teacherRepository;
    public void save(Teacher teacher){
        teacherRepository.save(teacher);
    }
    public Optional<Teacher> getById(Long id){
        return teacherRepository.findById(id);
    }
    public void delete(Long id){
        teacherRepository.deleteById(id);
    }
}
