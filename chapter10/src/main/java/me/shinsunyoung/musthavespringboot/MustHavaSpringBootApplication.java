package me.shinsunyoung.musthavespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MustHavaSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MustHavaSpringBootApplication.class, args);
    }
}

