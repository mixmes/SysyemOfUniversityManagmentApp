package ru.sfedu.SysyemOfUniversityManagment.config;

import jakarta.servlet.MultipartConfigElement;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

@Configuration
public class MultipartConfig {
    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.of(5, DataUnit.MEGABYTES));
        factory.setMaxRequestSize(DataSize.of(5,DataUnit.MEGABYTES));
        return factory.createMultipartConfig();
    }
}
