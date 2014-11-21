package gui;



import java.awt.Graphics;
import java.awt.Image;

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
	

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(this.imgBackground, 0, 0, null);
		for (Piece piece : ChessGui.gui_pieces) {
			g.drawImage(piece.getImage(), ChessGui.BOARD_START_X + ChessGui.TILE_OFFSET_X * piece.getCase().getY(),
					ChessGui.BOARD_START_Y + ChessGui.TILE_OFFSET_Y *piece.getCase().getX(), null);
			

		}
	}
	
}
