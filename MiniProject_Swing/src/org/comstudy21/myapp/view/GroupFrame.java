package org.comstudy21.myapp.view;

import static org.comstudy21.myapp.resource.R.title;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import org.comstudy21.myapp.evt.KeyEvtHandler;
import org.comstudy21.myapp.resource.R;

public class GroupFrame extends JFrame implements R{
	Container c = null;
	public GroupFrame() {
		c = getContentPane();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle(Grouptitle);
		c.addKeyListener(new KeyEvtHandler());
		// 레이아웃 및 패널 추가
		display();
		// 창 사이즈 조정
		setSize(360, 480);
		
		// --------------------[프레임 위치 설정하는 코드]----------------------
	    // 프레임(자바 화면) 크기
	    Dimension frameSize = getSize();
	    // 모니터 크기
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    // (모니터화면 가로 - 프레임화면 가로) / 2, (모니터화면 세로 - 프레임화면 세로) / 2
	    setLocation((screenSize.width - frameSize.width) /2, (screenSize.height - frameSize.height) /2);
	    // ----------------------------------------------------------------------

		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	GroupTitleView groupTitleView = new GroupTitleView();
	GroupMagementView groupmMgementView = new GroupMagementView();
	GroupListView grouplistView = new GroupListView();
	private void display() {
		c.setLayout(new BorderLayout());
		c.add(BorderLayout.NORTH, groupTitleView);
		c.add(BorderLayout.SOUTH, groupmMgementView);
		c.add(BorderLayout.CENTER, grouplistView);
	}
	
	
}
