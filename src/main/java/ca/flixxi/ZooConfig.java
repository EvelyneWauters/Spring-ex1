package ca.flixxi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Evelyne on 15/06/15.
 */
@Configuration
public class ZooConfig {
    @Bean
    public Zoo zoo()    {
        Zoo krugerPark = new ZooImpl("KrugerPark");
        krugerPark.addAnimal(new Sloth("Billie"));
        krugerPark.addAnimal(new Snake("Sheldon"));
        krugerPark.addAnimal(new SillyBug("Babe"));

        return krugerPark;
    }
}
