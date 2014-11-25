package AnimalWorld;

/**
 * Plants are stationary organisms that Herbivores and Omnivores eat
 *
 * @author Thomas Ashborn, David Benoit, Kevin Patraw, Nathan Plante
 */
public abstract class Plant implements Organism{
    
    /**
     * stores the x,y position of the Plant
     */
    protected int[] position;
    
    @Override
    public int[] getPosition(){
        return position;
    }
    
    @Override
    public int getX(){
        return position[0];
    }
    
    @Override
    public int getY(){
        return position[1];
    }
}
