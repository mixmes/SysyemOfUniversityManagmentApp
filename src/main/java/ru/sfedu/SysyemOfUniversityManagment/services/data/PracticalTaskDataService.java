package ru.sfedu.SysyemOfUniversityManagment.services.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sfedu.SysyemOfUniversityManagment.model.PracticalTask;
import ru.sfedu.SysyemOfUniversityManagment.repositories.PracticalTaskRepository;

import java.io.File;
import java.util.Optional;

@Service
public class PracticalTaskDataService {
    @Autowired
    PracticalTaskRepository practicalTaskRepository;
    public void save(PracticalTask practicalTask){
        practicalTaskRepository.save(practicalTask);
    }
    public void deleteById(Long id){
        practicalTaskRepository.deleteById(id);
    }
    public Optional<PracticalTask> get(Long id){
        return practicalTaskRepository.findById(id);
    }
    public void updateInfo(Long id,String info) throws Exception {
        Optional<PracticalTask> practicalTask = practicalTaskRepository.findById(id);
        if(practicalTask.isEmpty()){
            throw new Exception("No such practical task");
        }
        practicalTask.get().setInformation(info);
        save(practicalTask.get());
    }

}
