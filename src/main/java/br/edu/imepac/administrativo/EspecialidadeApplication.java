package br.edu.imepac.administrativo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication

public class EspecialidadeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EspecialidadeApplication.class, args);
    }
    @Bean(name = "modelMapperEspecialidade")
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        return modelMapper;
    }

}
