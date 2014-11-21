package gui;

import java.awt.Container;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

// Defines the action performed when the user clicks on the Scores menu
public class ScoresListener implements MenuListener {

	private Container container;
	private ScoresPannel scoresPannel;
	
	public ScoresListener(Container container){
		this.container = container;
	}
	@Override
	public void menuSelected(MenuEvent arg0) {
		container.removeAll();
		scoresPannel = new ScoresPannel();
		container.add(scoresPannel);
		container.revalidate();
		ChessGui.etat = false;
	}
	@Override
	public void menuCanceled(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void menuDeselected(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
