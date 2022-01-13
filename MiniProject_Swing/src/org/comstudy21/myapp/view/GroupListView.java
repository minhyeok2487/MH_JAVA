package org.comstudy21.myapp.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class GroupListView extends View {
	JPanel CenterPane = new JPanel();
	public GroupListView() {
		GroupcolumnIdentifiers.add("GROUP NAME");
		Groupdm.setColumnCount(1);
		
		display();
	}
	
	@Override
	public void display() {
		add(CenterPane);
		JPanel p1 = new JPanel();
		JScrollPane GroupLi = new JScrollPane(Grouptable);
		GroupLi.setPreferredSize(new Dimension(200,300));
		p1.add(GroupLi);
		p1.setBackground(Color.WHITE);
		CenterPane.add(p1);
		
		
	}
}
