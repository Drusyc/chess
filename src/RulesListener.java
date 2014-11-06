import java.awt.Container;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


public class RulesListener implements MenuListener {

	private Container container;
	private ScoresPannel rulesPannel;
	
	public RulesListener(Container container) {
		this.container = container;		
	}

	@Override
	public void menuCanceled(MenuEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void menuDeselected(MenuEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void menuSelected(MenuEvent e) {
		container.removeAll();
		rulesPannel = new ScoresPannel();
		container.add(rulesPannel);
		container.revalidate();

	}

}
