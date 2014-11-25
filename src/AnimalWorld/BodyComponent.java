package AnimalWorld;

/**
 * BodyComponent is a part of the composite Animal
 *
 * @author Thomas Ashborn, David Benoit, Kevin Patraw, Nathan Plante
 */
public interface BodyComponent {
    public int getSize();
    public void add(BodyComponent component) throws LeafComponentException;
    public void remove(BodyComponent component) throws LeafComponentException;
    public BodyComponent getChild(int i) throws LeafComponentException;
}
