package ca.flixxi;

/**
 * Created by Evelyne on 15/06/15.
 */
public interface Zoo {
    public void addAnimal(Animal a);
    public void releaseAnimal(Animal a);
    public String getName();
    public int countAnimals();
}
