package com.openHRM.pojo;
public class LoginPojo {

	private String username;
	private String password;
	private int id;

	public LoginPojo(){}
	
	public LoginPojo(String Uname,String passwd)
	{
		this.setUsername(Uname);
		this.setPassword(passwd);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Employee name: ").append(username);
		sb.append(" ,Employee password : ").append(password);

		return sb.toString();
		}

	
	
}
