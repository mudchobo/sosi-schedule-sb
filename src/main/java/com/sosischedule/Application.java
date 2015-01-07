package com.sosischedule;

import com.sosischedule.models.Sosi;
import com.sosischedule.repositories.SosiRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by jared on 15. 1. 2..
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        SosiRepository sosiRepository = context.getBean(SosiRepository.class);

        sosiRepository.save(new Sosi("태연"));
        sosiRepository.save(new Sosi("윤아"));
        sosiRepository.save(new Sosi("수영"));
        sosiRepository.save(new Sosi("효연"));
        sosiRepository.save(new Sosi("유리"));
        sosiRepository.save(new Sosi("티파니"));
        sosiRepository.save(new Sosi("써니"));
        sosiRepository.save(new Sosi("서현"));
    }
}
