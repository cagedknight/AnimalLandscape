package AnimalWorld;

/**
 * AnimalCreator creates Animals
 * 
 * @author  Thomas Ashborn, David Benoit, Kevin Patraw, Nathan Plante
 */
public class AnimalCreator
{
    /**
     * singleton instance of the AnimalCreator
     */
    private static AnimalCreator instance;
    
    /**
     * instance of the Factory
     */
    private AnimalFactory factory;
    
    private AnimalCreator(){
        factory = new SurfaceFactory();
    }
    
    /**
     * creates an Animal
     * 
     * @param s  the type of the Animal
     * @return 
     */
    public Animal createAnimal(String s){
        return factory.createAnimal(s);
    }
}
