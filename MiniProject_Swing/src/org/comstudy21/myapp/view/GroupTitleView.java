package org.comstudy21.myapp.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class GroupTitleView extends View {
	
	public GroupTitleView() {
		display();
	}

	@Override
	public void display() {
		JLabel lblTitle = new JLabel(Grouptitle);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
		this.add(lblTitle);
		
		setBackground(BG_COLOR);
		lblTitle.setForeground(Color.WHITE);
	}
}
