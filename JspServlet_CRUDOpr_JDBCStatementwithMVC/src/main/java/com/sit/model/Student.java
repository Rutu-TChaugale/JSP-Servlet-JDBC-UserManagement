package com.sit.model;

public class Student {
	private int id;
	private String fullname;
	private String email;
	private String username;
	private String password1;
	private String confirm_pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getConfirm_pass() {
		return confirm_pass;
	}
	public void setConfirm_pass(String confirm_pass) {
		this.confirm_pass = confirm_pass;
	}
	
	//tostring()
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullname=" + fullname + ", email=" + email + ", username=" + username
				+ ", password1=" + password1 + ", confirm_pass=" + confirm_pass + "]";
	}
	
	
	
}
