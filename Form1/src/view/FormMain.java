package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormMain {
	public static final int WIDTH = 780, HEIGHT = 350;
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("화면 구현 두번째 과제");
		frame.setSize(WIDTH, HEIGHT);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				System.exit(0);
			}
		});
		frame.setResizable(false);
		// 하단 버튼 구현
		JButton btn1 = new JButton("전체보기");
		JButton btn2 = new JButton("추가");
		JButton btn3 = new JButton("삭제");
		JButton btn4 = new JButton("검색");
		JButton btn5 = new JButton("취소");
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		frame.setLayout(new BorderLayout(5,5));
		
		panel1.add(btn1);
		panel1.add(btn2);
		panel1.add(btn3);
		panel1.add(btn4);
		panel1.add(btn5);
		frame.add(panel1,BorderLayout.SOUTH);
		
		// 좌측 화면 구현
		JLabel label1 = new JLabel("번 호");
		label1.setFont(new Font("맑은 고딕",Font.BOLD, 15));
		label1.setBounds(15,10,60,30);
		JLabel label2 = new JLabel("이 름");
		label2.setFont(new Font("맑은 고딕",Font.BOLD, 15));
		label2.setBounds(15,60,60,30);
		JLabel label3 = new JLabel("이 메 일");
		label3.setFont(new Font("맑은 고딕",Font.BOLD, 15));
		label3.setBounds(15,110,60,30);
		JLabel label4 = new JLabel("전화번호");
		label4.setFont(new Font("맑은 고딕",Font.BOLD, 15));
		label4.setBounds(15,170,60,30);
		JTextField text1 = new JTextField();
		text1.setBounds(80,10,150,35);
		JTextField text2 = new JTextField();
		text2.setBounds(80,60,150,35);
		JTextField text3 = new JTextField();
		text3.setBounds(80,110,150,35);
		JTextField text4 = new JTextField();
		text4.setBounds(80,170,150,35);
		
		JTextField label5 = new JTextField();
		label5.setBounds(240,0,3000,2000);
		label5.setBackground(new Color(238,238,238));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.add(label1);
		panel2.add(text1);
		panel2.add(label2);
		panel2.add(text2);
		panel2.add(label3);
		panel2.add(text3);
		panel2.add(label4);
		panel2.add(text4);
		panel2.add(label5);
		frame.add(panel2);
		
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
	}

}
