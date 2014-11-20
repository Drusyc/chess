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

import enumeration.Couleur;
import enumeration.TypePiece;
import pieces.Cavalier;
import pieces.Fou;
import pieces.Piece;
import pieces.Pion;
import pieces.Reine;
import pieces.Roi;
import pieces.Tour;
import plateau.Case;

/**
 * all x and y coordinates point to the upper left position of a component all
 * lists are treated as 0 being the bottom and size-1 being the top piece
 * 
 */
public class ChessGui extends JPanel {

	private static final long serialVersionUID = 3114147670071466558L;

	private static final int BOARD_START_X = 301;
	private static final int BOARD_START_Y = 51;

	private static final int TILE_OFFSET_X = 50;
	private static final int TILE_OFFSET_Y = 50;
	
	

	private Image imgBackground;
	private Container container;

	// 0 = bottom, size-1 = top
	private List<Piece> pieces = new ArrayList<Piece>();

	public ChessGui() {
		// load and set background image
		this.imgBackground = new ImageIcon("img/board.png").getImage();

		// create and place pieces
		//
		// rook, knight, bishop, queen, king, bishop, knight, and rook
		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_ROOK, BOARD_START_X + TILE_OFFSET_X * 0,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_KNIGHT, BOARD_START_X + TILE_OFFSET_X * 1,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_BISHOP, BOARD_START_X + TILE_OFFSET_X * 2,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_KING, BOARD_START_X + TILE_OFFSET_X * 3,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_QUEEN, BOARD_START_X + TILE_OFFSET_X * 4,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_BISHOP, BOARD_START_X + TILE_OFFSET_X * 5,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_KNIGHT, BOARD_START_X + TILE_OFFSET_X * 6,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_ROOK, BOARD_START_X + TILE_OFFSET_X * 7,
				BOARD_START_Y + TILE_OFFSET_Y * 7);
		// pawns
		for (int i = 0; i < 8; i++) {
			createAndAddPiece(Couleur.COLOR_WHITE, TypePiece.TYPE_PAWN, BOARD_START_X + TILE_OFFSET_X * i,
					BOARD_START_Y + TILE_OFFSET_Y * 6);
		}

		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_ROOK, BOARD_START_X + TILE_OFFSET_X * 0,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_KNIGHT, BOARD_START_X + TILE_OFFSET_X * 1,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_BISHOP, BOARD_START_X + TILE_OFFSET_X * 2,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_QUEEN, BOARD_START_X + TILE_OFFSET_X * 3,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_KING, BOARD_START_X + TILE_OFFSET_X * 4,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_BISHOP, BOARD_START_X + TILE_OFFSET_X * 5,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_KNIGHT, BOARD_START_X + TILE_OFFSET_X * 6,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_ROOK, BOARD_START_X + TILE_OFFSET_X * 7,
				BOARD_START_Y + TILE_OFFSET_Y * 0);
		for (int i = 0; i < 8; i++) {
			createAndAddPiece(Couleur.COLOR_BLACK, TypePiece.TYPE_PAWN, BOARD_START_X + TILE_OFFSET_X * i,
					BOARD_START_Y + TILE_OFFSET_Y * 1);
		}


		// create application frame and set visible
		//
		JFrame f = new JFrame();
		container = f.getContentPane();

		JMenuBar menu = new JMenuBar();
		
		JMenu file = new JMenu("File");
		JMenuItem newGame = new JMenuItem("New game");
		JMenu scores = new JMenu("Scores");
		JMenuItem rules = new JMenuItem("Rules");
		file.add(newGame);
		file.add(rules);
		
		menu.add(file);
		menu.add(scores);
		ScoresListener listenerScores = new ScoresListener(container);
		scores.addMenuListener(listenerScores);
		RulesListener listenerRules = new RulesListener(container);
		rules.addActionListener(listenerRules);
		
		f.setJMenuBar(menu);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(this);
		f.setResizable(false);
		f.setSize(this.imgBackground.getWidth(null), this.imgBackground.getHeight(null));
	
	}

	/**
	 * create a game piece
	 * 
	 * @param color color constant
	 * @param type type constant
	 * @param x x position of upper left corner
	 * @param y y position of upper left corner
	 */
	private void createAndAddPiece(Couleur color, TypePiece type, int x, int y) {
		Case ca = new Case();
		ca.setX(x);
		ca.setY(y);
		Image img = this.getImageForPiece(color, type);
		Piece piece = null;
		switch(type){
		case TYPE_BISHOP:
			piece = new Fou(img, type, color, ca);
		break;
		case TYPE_PAWN:
			piece = new Pion(img, type, color, ca);
		break;
		case TYPE_KING:
			piece = new Roi(img, type, color, ca);
		break;
		case TYPE_QUEEN:
			piece = new Reine(img, type, color, ca);
		break;
		case TYPE_KNIGHT:
			piece = new Cavalier(img, type, color, ca);
		break;
		case TYPE_ROOK:
			piece = new Tour(img, type, color, ca);
		break;
		default:
			break;
		}
		this.pieces.add(piece);
	}

	/**
	 * load image for given color and type. This method translates the color and
	 * type information into a filename and loads that particular file.
	 * 
	 * @param color color constant
	 * @param type type constant
	 * @return image
	 */
	private Image getImageForPiece(Couleur color, TypePiece type) {
		String filename = "";

		filename += (color == Couleur.COLOR_WHITE ? "w" : "b");
		switch (type) {
			case TYPE_BISHOP:
				filename += "b";
				break;
			case TYPE_KING:
				filename += "k";
				break;
			case TYPE_KNIGHT:
				filename += "n";
				break;
			case TYPE_PAWN:
				filename += "p";
				break;
			case TYPE_QUEEN:
				filename += "q";
				break;
			case TYPE_ROOK:
				filename += "r";
				break;
		}
		filename += ".png";
		return new ImageIcon("img/" + filename).getImage();
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(this.imgBackground, 0, 0, null);
		for (Piece piece : this.pieces) {
			g.drawImage(piece.getImage(), piece.getCase().getX(), piece.getCase().getY(), null);
		}
	}
	
	public static void main(String[] args) {
		new ChessGui();
	}

}