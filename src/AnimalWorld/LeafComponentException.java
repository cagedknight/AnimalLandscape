package AnimalWorld;

/**
 * LeafComponentException is an Exception that is thrown for when you try to add
 *        a component to a LeafComponent
 *
 * @author Thomas Ashborn, David Benoit, Kevin Patraw, Nathan Plante
 */
public class LeafComponentException extends Exception{
    public LeafComponentException(String s){
        super(s);
    }
}