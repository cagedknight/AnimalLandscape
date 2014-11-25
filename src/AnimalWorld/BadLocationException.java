package AnimalWorld;

/**
 * BadLocationException is the exception thrown when a location is
 *         out of bounds of the Board
 *
 * @author Thomas Ashborn, David Benoit, Kevin Patraw, Nathan Plante
 */
public class BadLocationException extends Exception{
    
    public BadLocationException(String s){
        super(s);
    }
}
