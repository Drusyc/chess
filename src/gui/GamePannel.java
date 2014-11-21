package gui;



import java.awt.Graphics;
import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import pieces.Piece;
import plateau.Plateau;

@SuppressWarnings("serial")
public class GamePannel extends JPanel {
	private Image imgBackground;

	
	public GamePannel() {
		this.imgBackground = new ImageIcon("img/board.png").getImage();
	}

	
	protected void paintComponent(Graphics g, Plateau board, List<Piece>  pieces) {
		g.drawImage(this.imgBackground, 0, 0, null);
		for (Piece piece : pieces) {
			g.drawImage(piece.getImage(), piece.getCase().getX(), piece.getCase().getY(), null);
		}
	}

}
