package Model;

import java.awt.*;
import java.awt.event.*;

public class main {
	public static final int WIDTH = 485, HEIGHT = 740;
	public static void main(String[] args) {
		
		MenuBar menubar;
		Menu menuView;
		Menu menuEdit;
		Menu menuHelp;
		Frame frame = new Frame();
		frame.setResizable(false);

		frame.setTitle("계산기");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLayout(null);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
				System.exit(0);
			}
		});

		menubar = new MenuBar();
		frame.setMenuBar(menubar);
		menuView = new Menu("보기(V)");
		menubar.add(menuView);
		menuEdit = new Menu("편집(E)");
		menubar.add(menuEdit);
		menuHelp = new Menu("도움말(H)");
		menubar.add(menuHelp);

		Panel p1 = new Panel();
		p1.setBackground(new Color(204,255,255));
		Label Number = new Label("0",Label.RIGHT);
		Number.setBounds(15, 10, 440, 80);
		Number.setFont(new Font("맑은 고딕",Font.BOLD, 40));
		Color color = new Color(247,251,254);
		Number.setBackground(color);
		
		
		Panel p2 = new Panel();
		p2.setBackground(new Color(233,233,233));
		p2.setLayout(null);
		Button btnMC = new Button("MC");
		btnMC.setBounds(15,110,80,80);
		Button btnMR = new Button("MR");
		btnMR.setBounds(105,110,80,80);
		Button btnMS = new Button("MS");
		btnMS.setBounds(195,110,80,80);
		Button btnMPlus = new Button("M+");
		btnMPlus.setBounds(285,110,80,80);
		Button btnMMi = new Button("M-");
		btnMMi.setBounds(375,110,80,80);
		Button btnFlow = new Button("<-");
		btnFlow.setBounds(15,205,80,80);
		Button btnCE = new Button("CE");
		btnCE.setBounds(105,205,80,80);
		Button btnC = new Button("C");
		btnC.setBounds(195,205,80,80);
		Button btnPLusMi = new Button("+-");
		btnPLusMi.setBounds(285,205,80,80);
		Button btnRoot = new Button("root");
		btnRoot.setBounds(375,205,80,80);
		Button btn0 = new Button("0");
		btn0.setBounds(15,565,170,80);
		Button btn1 = new Button("1");
		btn1.setBounds(15,475,80,80);
		Button btn2 = new Button("2");
		btn2.setBounds(105,475,80,80);
		Button btn3 = new Button("3");
		btn3.setBounds(195,475,80,80);
		Button btn4 = new Button("4");
		btn4.setBounds(15,385,80,80);
		Button btn5 = new Button("5");
		btn5.setBounds(105,385,80,80);
		Button btn6 = new Button("6");
		btn6.setBounds(195,385,80,80);
		Button btn7 = new Button("7");
		btn7.setBounds(15,295,80,80);
		Button btn8 = new Button("8");
		btn8.setBounds(105,295,80,80);
		Button btn9 = new Button("9");
		btn9.setBounds(195,295,80,80);
		Button btndot = new Button(".");
		btndot.setBounds(195,565,80,80);
		Button btnSl = new Button("/");
		btnSl.setBounds(285,295,80,80);
		Button btnMul = new Button("*");
		btnMul.setBounds(285,385,80,80);
		Button btnMi = new Button("-");
		btnMi.setBounds(285,475,80,80);
		Button btnPlus = new Button("+");
		btnPlus.setBounds(285,565,80,80);
		Button btnPer = new Button("%");
		btnPer.setBounds(375,295,80,80);
		Button btnX = new Button("1/x");
		btnX.setBounds(375,385,80,80);
		Button btnEqul = new Button("=");
		btnEqul.setBounds(375,475,80,170);

		p2.add(btnMC);
		p2.add(btnMR);
		p2.add(btnMS);
		p2.add(btnMPlus);
		p2.add(btnMMi);
		p2.add(btnFlow);
		p2.add(btnCE);
		p2.add(btnC);
		p2.add(btnPLusMi);
		p2.add(btnRoot);
		p2.add(btn7);
		p2.add(btn8);
		p2.add(btn9);
		p2.add(btnSl);
		p2.add(btnPer);
		p2.add(btn4);
		p2.add(btn5);
		p2.add(btn6);
		p2.add(btnMul);
		p2.add(btnX);
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(btnMi);
		p2.add(btnEqul);
		p2.add(btn0);
		p2.add(btndot);
		p2.add(btnPlus);
		
		p2.add(Number);
		
		
		frame.setLayout(new BorderLayout());
		frame.add(p2,BorderLayout.CENTER);

		
		
		frame.setVisible(true);
	}
}
