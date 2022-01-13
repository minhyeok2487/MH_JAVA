package org.comstudy21.myapp.model;

import java.util.Vector;

public class Dto {
	String no;
	String name;
	String email;
	String phone;
	String group;
	
	public Dto(String no, String name, String email, String phone, String group) {
		this.no = no;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.group = group;
	}
	public Dto() {
		no = "";
		name = "";
		email = "";
		phone = "";
		group = "기본";
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Dto [no=" + no + ", name=" + name + ", email=" + email + ", phone=" + phone + ", group=" + group + "]";
	}
	
	public Vector<String> getVector() {
		Vector<String> v = new Vector<>();
		v.add(no);
		v.add(name);
		v.add(email);
		v.add(phone);
		v.add(group);
		return v;
	}
	
	// hashCode와 equals를 재정의 해야 한다.
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Dto) {
			Dto dto = (Dto) obj;
			if(name.equals(dto.name)) {
				return true;
			}
		}
		return false;
	}
}
