package main;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;

public class Square extends JPanel
{
	private static final long serialVersionUID = 1L;
	private int row;
	private int col;
	private Color cellColor;
	private Piece piece;

	public Square(int row, int col, Piece piece) {
		setLayout(null);
		setEnabled(true);
		this.row = row;
		this.col = col;
		this.piece = piece;
					
		//if((row!=0 && col!=0 && (row + col) % 2 == 0 )) {
		if((row + col) % 2 == 0 ) {
			this.cellColor = Color.WHITE;
		} else {
			this.cellColor = Color.BLACK;
		}
			
		setBackground(this.cellColor);
		setBorder(new MatteBorder(1, 1, 1, 1, new Color(200, 200, 224)));
	}

	@Override 
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g.create();
		GraphicsEnvironment.getLocalGraphicsEnvironment();

<<<<<<< HEAD

=======
>>>>>>> ded5fdc3350a40317e46fbc57e8669a5c20aeb5a
			g2d.setFont(new Font("LucidaSans", Font.PLAIN, 80));
			//Piece piece = pieces[row][col];
			g2d.setPaint(piece.color);
			g2d.drawString(piece.pieceType, 5, 70);	
			g2d.dispose();
		}
		//26
<<<<<<< HEAD
	
=======
		
		
		public Color getBackground() {
			return this.cellColor;
		}
		
		public void setCellColor(Color color) {
			this.cellColor = color;
		}
>>>>>>> ded5fdc3350a40317e46fbc57e8669a5c20aeb5a
	//26
	
	public Color getCellColor() {
		return cellColor;
	}
<<<<<<< HEAD
	
		
		public void highlight() {
			Color color = this.cellColor;
			//28
			Square startSpot = new Square(row,col,piece);
			//28
			if (color == Color.BLACK || color == Color.WHITE) {
				setCellColor(Color.YELLOW);
				} else if ((cellColor == Color.YELLOW) && (row + col) % 2 == 0 ) {
					setCellColor(Color.WHITE);
				} else if (cellColor == Color.YELLOW) {
					setCellColor(Color.BLACK);
				}
	    	if (piece.pieceType.equals("\u265B")) {
	    		System.out.println("It is a queen");
	    	}
				
=======
		
	public void highlight() {
		Color color = this.cellColor;
		//28
		Square startSpot = new Square(row,col,piece);
		//28
		if (color == Color.BLACK || color == Color.WHITE) {
			setCellColor(Color.YELLOW);
			} else if ((cellColor == Color.YELLOW) && (row + col) % 2 == 0 ) {
				setCellColor(Color.WHITE);
			} else if (cellColor == Color.YELLOW) {
				setCellColor(Color.BLACK);
>>>>>>> ded5fdc3350a40317e46fbc57e8669a5c20aeb5a
			}
				
		}
		
<<<<<<< HEAD
		public void highlightEndPoint() {
			Color color = this.cellColor;
			Square endSpot = new Square(row,col,piece);
			
			if (color == Color.BLACK || color == Color.WHITE) {
				setCellColor(Color.GREEN);
			
		}
			//JOptionPane.showMessageDialog(null, "THE MOVE IS VALID", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		
		
		//26
		

	}

=======
}
>>>>>>> ded5fdc3350a40317e46fbc57e8669a5c20aeb5a
