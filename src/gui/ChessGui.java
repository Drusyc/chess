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

	private static final int BOARD_START_X = 301;
	private static final int BOARD_START_Y = 51;

	private static final int TILE_OFFSET_X = 50;
	private static final int TILE_OFFSET_Y = 50;
	
	public GamePannel gp;
	

	private Image imgBackground;
	private Container container;

	// 0 = bottom, size-1 = top
	public static List<Piece> gui_pieces = new ArrayList<Piece>();

	public ChessGui() {
		// background image
		this.imgBackground = new ImageIcon("img/board.png").getImage();

//		// create and place pieces
//		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_ROOK, BOARD_START_X + TILE_OFFSET_X * 0,
//				BOARD_START_Y + TILE_OFFSET_Y * 7);
//		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_KNIGHT, BOARD_START_X + TILE_OFFSET_X * 1,
//				BOARD_START_Y + TILE_OFFSET_Y * 7);
//		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_BISHOP, BOARD_START_X + TILE_OFFSET_X * 2,
//				BOARD_START_Y + TILE_OFFSET_Y * 7);
//		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_KING, BOARD_START_X + TILE_OFFSET_X * 3,
//				BOARD_START_Y + TILE_OFFSET_Y * 7);
//		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_QUEEN, BOARD_START_X + TILE_OFFSET_X * 4,
//				BOARD_START_Y + TILE_OFFSET_Y * 7);
//		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_BISHOP, BOARD_START_X + TILE_OFFSET_X * 5,
//				BOARD_START_Y + TILE_OFFSET_Y * 7);
//		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_KNIGHT, BOARD_START_X + TILE_OFFSET_X * 6,
//				BOARD_START_Y + TILE_OFFSET_Y * 7);
//		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_ROOK, BOARD_START_X + TILE_OFFSET_X * 7,
//				BOARD_START_Y + TILE_OFFSET_Y * 7);
//		// pawns
//		for (int i = 0; i < 8; i++) {
//			createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_PAWN, BOARD_START_X + TILE_OFFSET_X * i,
//					BOARD_START_Y + TILE_OFFSET_Y * 6);
//		}
//
//		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_ROOK, BOARD_START_X + TILE_OFFSET_X * 0,
//				BOARD_START_Y + TILE_OFFSET_Y * 0);
//		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_KNIGHT, BOARD_START_X + TILE_OFFSET_X * 1,
//				BOARD_START_Y + TILE_OFFSET_Y * 0);
//		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_BISHOP, BOARD_START_X + TILE_OFFSET_X * 2,
//				BOARD_START_Y + TILE_OFFSET_Y * 0);
//		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_QUEEN, BOARD_START_X + TILE_OFFSET_X * 3,
//				BOARD_START_Y + TILE_OFFSET_Y * 0);
//		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_KING, BOARD_START_X + TILE_OFFSET_X * 4,
//				BOARD_START_Y + TILE_OFFSET_Y * 0);
//		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_BISHOP, BOARD_START_X + TILE_OFFSET_X * 5,
//				BOARD_START_Y + TILE_OFFSET_Y * 0);
//		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_KNIGHT, BOARD_START_X + TILE_OFFSET_X * 6,
//				BOARD_START_Y + TILE_OFFSET_Y * 0);
//		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_ROOK, BOARD_START_X + TILE_OFFSET_X * 7,
//				BOARD_START_Y + TILE_OFFSET_Y * 0);
//		for (int i = 0; i < 8; i++) {
//			createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_PAWN, BOARD_START_X + TILE_OFFSET_X * i,
//					BOARD_START_Y + TILE_OFFSET_Y * 1);
//		}


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

	// Creates a game piece
//	private void createAndAddPiece(Couleur color, TypePiece type, int x, int y) {
//		Case ca = new Case();
//		ca.setX(x);
//		ca.setY(y);
//		Image img = this.getImageForPiece(color, type);
//		Piece piece = null;
//		switch(type){
//		case TYPE_BISHOP:
//			piece = new Fou(img, type, color, ca);
//		break;
//		case TYPE_PAWN:
//			piece = new Pion(img, type, color, ca);
//		break;
//		case TYPE_KING:
//			piece = new Roi(img, type, color, ca);
//		break;
//		case TYPE_QUEEN:
//			piece = new Reine(img, type, color, ca);
//		break;
//		case TYPE_KNIGHT:
//			piece = new Cavalier(img, type, color, ca);
//		break;
//		case TYPE_ROOK:
//			piece = new Tour(img, type, color, ca);
//		break;
//		default:
//			break;
//		}
//		this.pieces.add(piece);
//	}


	// Loads image for given color and type. This method translates the color and
	// type information into a filename and loads that particular file.
//	private Image getImageForPiece(Couleur color, TypePiece type) {
//		String filename = "";
//
//		filename += (color == Couleur.COLOR_WHITE ? "w" : "b");
//		switch (type) {
//			case TYPE_BISHOP:
//				filename += "b";
//				break;
//			case TYPE_KING:
//				filename += "k";
//				break;
//			case TYPE_KNIGHT:
//				filename += "n";
//				break;
//			case TYPE_PAWN:
//				filename += "p";
//				break;
//			case TYPE_QUEEN:
//				filename += "q";
//				break;
//			case TYPE_ROOK:
//				filename += "r";
//				break;
//		}
//		filename += ".png";
//		return new ImageIcon("img/" + filename).getImage();
//	}
	
	public void setPiece (Plateau board) {
		ChessGui.gui_pieces = board.pieces;
	}
	
//	@Override
//	public void paintComponent(Graphics g) {
//		g.drawImage(this.imgBackground, 0, 0, null);
//		for (Piece piece : gui_pieces) {
//			g.drawImage(piece.getImage(), piece.getCase().getX(), piece.getCase().getY(), null);
//		}
//	}

	public void paintComponent(Graphics g, Plateau board) {
		g.drawImage(this.imgBackground, 0, 0, null);
		for (Piece piece : board.pieces) {
			g.drawImage(piece.getImage(), piece.getCase().getX(), piece.getCase().getY(), null);
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		for (Piece piece : gui_pieces) {
			g.drawImage(piece.getImage(), piece.getCase().getX(), piece.getCase().getY(), null);
		}
		System.out.println("paint");
	}

//	@Override
//	public void repaint() {
//		this.paintComponents(this.getGraphics());
//	}
	
	public void draw (Plateau board) {
		Graphics g = this.getGraphics();
		g.drawImage(this.imgBackground, 0, 0, null);
//		for (Piece piece : board.pieces) {
//			g.drawImage(piece.getImage(), piece.getCase().getX(), piece.getCase().getY(), null);
//		}
		this.paintComponents(g);
	}
	
//	public static void main(String[] args) {
//		new ChessGui();
//	}

}
