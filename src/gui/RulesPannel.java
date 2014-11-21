package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class RulesPannel extends JPanel {

	public RulesPannel() {
		this.setLayout(new BorderLayout());
		this.setBackground(Color.white);
		
		JLabel intro = new JLabel("Rules !");
		intro.setHorizontalAlignment(JLabel.CENTER);
		Font fIntro = new Font("Serif", Font.BOLD,20);
		intro.setFont(fIntro);
		this.add(intro, BorderLayout.CENTER);
	}

}
