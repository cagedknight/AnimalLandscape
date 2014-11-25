package AnimalWorld;

/**
 * AnimalFactory is used by the AnimalCreator to create Animals
 * 
 * @author  Thomas Ashborn, David Benoit, Kevin Patraw, Nathan Plante
 */
public interface AnimalFactory
{
    /**
     * Creates an Animal
     * 
     * @param s  The type of Animal
     * @return 
     */
   public Animal createAnimal(String s);
}
