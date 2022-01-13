package org.comstudy21.myapp.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.comstudy21.myapp.evt.MouseEvtHandler;

public class GroupMagementView extends View {
	JPanel leftPane = new JPanel(new GridLayout(2,1));
	
	public GroupMagementView() {
		display();
	}

	@Override
	public void display() {
		add(leftPane);
		
		JPanel p1 = new JPanel();
		p1.add(new JLabel("GROUP NAME : "));
		p1.add(grouptxtNo);
		leftPane.add(p1);
		
		JPanel p2 = new JPanel();
		p2.add(btnAppendGroup);
		p2.add(btnDeleteGroup);
		leftPane.add(p2);
		
	
		
		
	}
	

}
