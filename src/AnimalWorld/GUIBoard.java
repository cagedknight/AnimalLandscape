package AnimalWorld;


import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

/**
 * GUIBoard is the container for the board
 *
 * @author Thomas Ashborn, David Benoit, Kevin Patraw, Nathan Plante
 */
public class GUIBoard extends JPanel{
    
    private Board board;
    
    public GUIBoard(Board b){
        super();
        setBackground(Color.WHITE);
        super.setSize(b.getWidth()*10,b.getHeight()*10);
        super.setVisible(true);
        board = b;
    }
    
    public void paintComponent(Graphics g){
        int width = getWidth();
        int height = getHeight();
        
        super.paintComponent(g);
        
        for(int i = 0; i < board.getWidth(); i++){
            for(int j = 0; j < board.getHeight(); j++){
                g.setColor(board.getTile(i,j).getColor());
                g.fillRect(i*10, j*10, 10, 10);
            }
        }
    }
}
