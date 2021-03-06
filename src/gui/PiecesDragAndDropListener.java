package gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;

import pieces.Piece;
import plateau.Case;
import visiteur.Deplacement;
import visiteur.Visiteur;

public class PiecesDragAndDropListener implements MouseListener, MouseMotionListener {

	private List<Piece> pieces;
	private ChessGui chessGui;
	
	private Piece dragPiece;
	private Case PosDeb;
	private int dragOffsetX;
	private int dragOffsetY;
	

	public PiecesDragAndDropListener(List<Piece> pieces, ChessGui chessGui) {
		this.pieces = ChessGui.gui_pieces;

		this.chessGui = chessGui;
	}

	@Override
	public void mousePressed(MouseEvent evt) {
		int x = evt.getPoint().x;
		int y = evt.getPoint().y;
		System.out.println("okokok");
		// find out which piece to move.
		// we check the list from top to buttom
		// (therefore we itereate in reverse order)
		//
		for (int i = this.pieces.size()-1; i >= 0; i--) {
			Piece piece = this.pieces.get(i);
			
			if( mouseOverPiece(piece,x,y)){
				// calculate offset, because we do not want the drag piece
				// to jump with it's upper left corner to the current mouse
				// position
				//
				System.out.println("Click sur pièce");
				this.dragOffsetX = x - (ChessGui.BOARD_START_X + ChessGui.TILE_OFFSET_X *piece.getCase().getX());
				this.dragOffsetY = y - (ChessGui.BOARD_START_Y + ChessGui.TILE_OFFSET_Y *piece.getCase().getY());
				this.dragPiece = piece;
				break;
			}
		}
		
		// move drag piece to the top of the list
		if(this.dragPiece != null){
			this.pieces.remove( this.dragPiece );
			this.pieces.add(this.dragPiece);
		}
	}

	/**
	 * check whether the mouse is currently over this piece
	 * @param piece the playing piece
	 * @param x x coordinate of mouse
	 * @param y y coordinate of mouse
	 * @return true if mouse is over the piece
	 */
	private boolean mouseOverPiece(Piece piece, int x, int y) {
		return (ChessGui.BOARD_START_X + ChessGui.TILE_OFFSET_X *piece.getCase().getX() <= x )
			&& (ChessGui.BOARD_START_X + ChessGui.TILE_OFFSET_X *piece.getCase().getX()+piece.getWidth() >= x)
			&& (ChessGui.BOARD_START_Y + ChessGui.TILE_OFFSET_Y *piece.getCase().getY() <= y)
			&& (ChessGui.BOARD_START_Y + ChessGui.TILE_OFFSET_Y *piece.getCase().getY()+piece.getHeight() >= y);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		/* a développer
		 Visiteur c = new Deplacement(dragPiece.getCase());
		dragPiece.appliquer(c);*/
		this.dragPiece = null;
	}

	@Override
	public void mouseDragged(MouseEvent evt) {
		if(this.dragPiece != null){
		
			int x = (int)((-ChessGui.BOARD_START_X+evt.getPoint().x - this.dragOffsetX)/ChessGui.TILE_OFFSET_X);
			int y = (int)((-ChessGui.BOARD_START_Y+evt.getPoint().y - this.dragOffsetY)/ChessGui.TILE_OFFSET_Y);
			
			if(x>=0 && x<8 && y>=0 && y<8){
			
			Case n = dragPiece.getCase().getBoard().getIJ(x,y);
			this.dragPiece.setCase(n);
			System.out.println(dragPiece.getCase().getX()+"*"+dragPiece.getCase().getY()+"\n");
			this.chessGui.repaint();}
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		PosDeb = dragPiece.getCase();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}
	
	@Override
	public void mouseMoved(MouseEvent arg0) {}

}