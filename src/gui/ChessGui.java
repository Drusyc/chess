package gui;




import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import pieces.Piece;
import plateau.Plateau;



// the origin of the axis is at the upper left corner of the window
public class ChessGui extends JPanel {
	
	public static boolean etat = false;
	
	public boolean getEtat(){
		return etat;
	}
//	public void setEtat(boolean etat){
//		this.etat = etat;
//	}
	
	private static final long serialVersionUID = 3114147670071466558L;

	protected static final int BOARD_START_X = 301;
	protected static final int BOARD_START_Y = 51;

	protected static final int TILE_OFFSET_X = 50;
	protected static final int TILE_OFFSET_Y = 50;
	
	public GamePannel gp;
	

	private Image imgBackground;
	private Container container;

	// 0 = bottom, size-1 = top
	public static List<Piece> gui_pieces = new ArrayList<Piece>();

	public ChessGui() {
		// background image
		this.imgBackground = new ImageIcon("img/board.png").getImage();

		// Frame
		JFrame f = new JFrame();
		container = f.getContentPane();

		// Menu
		JMenuBar menu = new JMenuBar();
		
		JMenu file = new JMenu("File");
		JMenuItem newGame = new JMenuItem("New game");
		JMenu scores = new JMenu("Scores");
		JMenuItem rules = new JMenuItem("Rules");
		file.add(newGame);
		file.add(rules);
		
		menu.add(file);
		menu.add(scores);
		
		// Listeners
		ScoresListener listenerScores = new ScoresListener(container);
		scores.addMenuListener(listenerScores);
		RulesListener listenerRules = new RulesListener(container);
		rules.addActionListener(listenerRules);
		GameListener listenerGame = new GameListener(container);
		
		newGame.addActionListener(listenerGame);
		
		f.setJMenuBar(menu);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(this);
		f.setResizable(false);
		f.setSize(this.imgBackground.getWidth(null), this.imgBackground.getHeight(null));
	
	}
	
	public void setPiece (Plateau board) {
		ChessGui.gui_pieces = board.pieces;
	}

	
	@Override
	public void paintComponent(Graphics g) {
		for (Piece piece : gui_pieces) {
			g.drawImage(piece.getImage(), BOARD_START_X + TILE_OFFSET_X *piece.getCase().getX(), BOARD_START_Y +TILE_OFFSET_Y *piece.getCase().getY(), null);
		}
		System.out.println("paint");
	}

	
}
