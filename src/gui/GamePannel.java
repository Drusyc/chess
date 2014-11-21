package gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import enumeration.Couleur;
import enumeration.TypePiece;

public class GamePannel extends JPanel {
	//private Image imgBackground;
	public GamePannel() {
		this.setLayout(new BorderLayout());
		this.setBackground(Color.white);
		
		JLabel intro = new JLabel("test!");
		intro.setHorizontalAlignment(JLabel.CENTER);
		Font fIntro = new Font("Serif", Font.BOLD,20);
		intro.setFont(fIntro);
		this.add(intro, BorderLayout.CENTER);
	}

}
