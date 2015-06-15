package ca.flixxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Evelyne on 15/06/15.
 */
@SpringBootApplication
public class ApplicationConfiguration {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ZooConfig.class);
        Zoo zoo = run.getBean(Zoo.class);
        System.out.println(zoo.countAnimals());
        System.out.println(zoo.getName());
    }
}
