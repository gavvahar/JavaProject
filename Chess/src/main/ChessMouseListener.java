package main;
import java.awt.event.*;
import java.beans.*;
public class ChessMouseListener extends MouseAdapter
{
	@Override
    public void mousePressed(MouseEvent e)
    {
        Square square = (Square) e.getSource();    
        if(e.getButton() == 3)
        {
        square.highlight();
        square.getParent().repaint();

        } else if (e.getButton() == 1)
        {	
            square.highlightEndPoint();
            square.getParent().repaint();
        }
    }
    
    public void propertyChange(PropertyChangeEvent evt)
    {
    
    }
}