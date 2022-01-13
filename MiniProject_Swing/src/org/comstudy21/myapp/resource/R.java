package org.comstudy21.myapp.resource;

import java.awt.Color;
import java.awt.Container;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import org.comstudy21.myapp.controller.Controller;
import org.comstudy21.myapp.model.Dto;

public interface R {
	// 상수값을 한곳에 모아 둔다.
	// 결합도는 낮추고, 응집력은 높이는 프로그래밍
	// 결합도가 높은 프로그램은 스파게티코드이다.
	String title = "::: Memeber Management System :::";
	String Grouptitle = "::: Group Management System :::";
	int frameWidth=720, frameHeight=480;
	
	Vector<String> v = new Vector<String>();
	String[] listStr = {"기본", "친구", "지인"};
	// JTextField는 View와 Controller에서 모두 접근해야 한다.
	JTextField txtNo = new JTextField(10);
	JTextField grouptxtNo = new JTextField(8);
	JTextField txtName = new JTextField(10);
	JTextField txtEmail = new JTextField(10);
	JTextField txtPhone = new JTextField(10);
	JComboBox<String> comboGroup = new JComboBox<String>(listStr);
	
	
	Color BG_COLOR = new Color(190, 205, 255);
	
	Vector dataVector = new Vector();
	Vector columnIdentifiers = new Vector();
	DefaultTableModel dm = new DefaultTableModel(dataVector, columnIdentifiers);
	JTable table= new JTable(dm);
	
	JButton btnAll = new JButton("전체보기");
	JButton btnAppend = new JButton("추가");
	JButton btnDelete = new JButton("삭제");
	JButton btnSearch = new JButton("검색");
	JButton btnReset = new JButton("데이터 불러오기");
	JButton btnGroup = new JButton("그룹 관리");
	HashMap<JButton, Controller> ctrlMap = new HashMap<>();
	
	
	Vector GroupdataVector = new Vector();
	Vector GroupcolumnIdentifiers = new Vector();
	DefaultTableModel Groupdm = new DefaultTableModel(GroupdataVector, GroupcolumnIdentifiers);
	JTable Grouptable= new JTable(Groupdm);
	
	JButton btnAppendGroup = new JButton("그룹 추가");
	JButton btnDeleteGroup = new JButton("그룹 삭제");
	
}
