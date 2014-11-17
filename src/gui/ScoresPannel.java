package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class ScoresPannel extends JPanel {

	public ScoresPannel() {
		// TODO Auto-generated constructor stub
		this.setLayout(new BorderLayout());
		this.setBackground(Color.white);
		
		JLabel intro = new JLabel("Scores !");
		intro.setHorizontalAlignment(JLabel.CENTER);
		Font fIntro = new Font("Serif", Font.BOLD,20);
		intro.setFont(fIntro);
		this.add(intro, BorderLayout.CENTER);
		
	}
}
