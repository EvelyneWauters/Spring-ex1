package ca.flixxi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evelyne on 15/06/15.
 */
public class ZooImpl implements Zoo {
    private String name;
    private List<Animal> animals= new ArrayList<>();

    public ZooImpl(String name) {
        this.name = name;
    }

    @Override
    public void addAnimal(Animal a) {
        this.animals.add(a);
    }

    @Override
    public void releaseAnimal(Animal a) {
        animals.remove(a);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int countAnimals() {
        return animals.size();
    }
}
