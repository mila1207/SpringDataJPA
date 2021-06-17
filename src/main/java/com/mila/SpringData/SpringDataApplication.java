package com.mila.SpringData;

import com.mila.SpringData.entity.Student;
import com.mila.SpringData.repositoy.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLinerRunner(StudentRepository studentRepository) {

        return args -> {
            Student mila = new Student(
                    "Mila",
					"M",
					"mila@gmail.com",
					28
            );
            studentRepository.save(mila);
        };
    }
}
