package org.comstudy21.myapp.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class GroupListView extends View {
	JPanel CenterPane = new JPanel();

	public GroupListView() {
		Vector<String> Group = new Vector<String>();
		Group.add("기본");
		Vector<String> Group2 = new Vector<String>();
		Group2.add("친구");
		Vector<String> Group3 = new Vector<String>();
		Group3.add("지인");
		GroupcolumnIdentifiers.add("GROUP NAME");
		GroupdataVector.add(Group);
		GroupdataVector.add(Group2);
		GroupdataVector.add(Group3);
		Groupdm.setColumnCount(1);

		display();
	}

	@Override
	public void display() {
		add(CenterPane);
		JPanel p1 = new JPanel();
		JScrollPane GroupLi = new JScrollPane(Grouptable);
		GroupLi.setPreferredSize(new Dimension(200, 300));
		p1.add(GroupLi);
		p1.setBackground(Color.WHITE);
		CenterPane.add(p1);

	}
}
