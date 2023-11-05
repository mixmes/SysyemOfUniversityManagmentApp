package ru.sfedu.SysyemOfUniversityManagment.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
@Service
@PropertySource("classpath:application.yaml")
public class EducationalMaterialFileService {
    @Value("${filepath.tasks}")
    private String taskFilePath;
    @Value("${filepath.lections}")
    private String lectionsFilePath;
    public enum TypeOfFile{
        PRACTICAL_TASK,
        LECTION
    }
    public String createFile(MultipartFile outputFile,TypeOfFile type) throws IOException {
        String pathOfTheFile = "";
        switch (type){
            case PRACTICAL_TASK:
                File practicalTaskFile = new File(lectionsFilePath+outputFile.getOriginalFilename());
                writeToFile(outputFile,practicalTaskFile);
                pathOfTheFile = practicalTaskFile.getAbsolutePath();
            case LECTION :
                File lectionFile = new File(lectionsFilePath+outputFile.getOriginalFilename());
                writeToFile(outputFile,lectionFile);
                pathOfTheFile = lectionFile.getAbsolutePath();
                break;
        }
        return pathOfTheFile;
    }
    private void writeToFile(MultipartFile outputFile,File persistedFile) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(persistedFile);
        fileOutputStream.write(outputFile.getBytes());
        fileOutputStream.close();
    }
}
