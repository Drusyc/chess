package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Defines the action performed when the user clicks on the Rules submenu
public class RulesListener implements ActionListener {

	private Container container;
	private RulesPannel rulesPannel;
	
	public RulesListener(Container container) {
		this.container = container;		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		container.removeAll();
		rulesPannel = new RulesPannel();
		container.add(rulesPannel);
		container.revalidate();
		
	}

}
