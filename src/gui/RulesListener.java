package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RulesListener implements ActionListener {

	private Container container;
	private ScoresPannel rulesPannel;
	
	public RulesListener(Container container) {
		this.container = container;		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		container.removeAll();
		rulesPannel = new ScoresPannel();
		container.add(rulesPannel);
		container.revalidate();
		
	}

}
