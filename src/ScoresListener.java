import java.awt.Container;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


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
