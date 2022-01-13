package org.comstudy21.myapp.controller;

import org.comstudy21.myapp.model.Dao;
import org.comstudy21.myapp.view.GroupFrame;

public class GroupController implements Controller {
	public void service() {
		new GroupFrame();
	}

}
