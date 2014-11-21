package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameListener implements ActionListener {

	private Container container;
	private GamePannel gamePannel;
	
	public GameListener(Container container) {
		this.container = container;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		container.removeAll();
		gamePannel = new GamePannel();
		container.add(gamePannel);
		container.revalidate();
		container.repaint();
		ChessGui.etat = true;
		
	}

}
