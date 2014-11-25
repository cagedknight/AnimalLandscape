package AnimalWorld;

/**
 * BodyComponent is a part of the composite Animal
 *
 * @author Thomas Ashborn, David Benoit, Kevin Patraw, Nathan Plante
 */
public interface BodyComponent {
    
    public int getSize();
    
    /**
     * adds a component to an Organism
     * 
     * @param component the component being added to the Organism
     * @throws LeafComponentException leaf components can not have components added to them
     */
    public void add(BodyComponent component) throws LeafComponentException;
    
    /**
     * removes a component from an Organism
     * 
     * @param component the component being removed from the Organism
     * @throws LeafComponentException leaf components have no components to remove
     */
    public void remove(BodyComponent component) throws LeafComponentException;
    
    /**
     * gets the child component of the body part of the Organism
     * 
     * @param i the int associated with the child component
     * @return the child component
     * @throws LeafComponentException leaf components have no component children
     */
    public BodyComponent getChild(int i) throws LeafComponentException;
}
