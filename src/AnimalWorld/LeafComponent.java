package AnimalWorld;

/**
 * LeafComponent is a part of the composite Animal
 *         LeafComponents have no other Components attached to them
 *
 * @author Thomas Ashborn, David Benoit, Kevin Patraw, Nathan Plante
 */
public abstract class LeafComponent implements BodyComponent {
    
    private LeafComponentException except = new LeafComponentException("This leaf has no children");
    
    /**
     * how large the BodyComponent is
     */
    private int size;
    
    
    public LeafComponent(int tempSize){
        size = tempSize;
    }
    
    @Override
    public int getSize(){
        return size;
    }
    
    @Override
    public void add(BodyComponent component) throws LeafComponentException{
        throw except;
    }
    
    @Override
    public void remove(BodyComponent component) throws LeafComponentException{
        throw except;
    }
    
    @Override
    public BodyComponent getChild(int i) throws LeafComponentException{
        throw except;
    }      
}