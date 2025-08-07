package com.board.users.domain;

public class UserDTO {
	// Fields
	private  String  userid;
	private  String  passwd;
	private  String  username;
	private  String  email;
	private  int  upoint;
	private  String  indate;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUpoint() {
		return upoint;
	}
	public void setUpoint(int upoint) {
		this.upoint = upoint;
	}
	public String getIndate() {
		return indate;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	public UserDTO() {
		super();
	}
	public UserDTO(String userid, String passwd, String username, String email, int upoint, String indate) {
		this.userid = userid;
		this.passwd = passwd;
		this.username = username;
		this.email = email;
		this.upoint = upoint;
		this.indate = indate;
	}
	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", passwd=" + passwd + ", username=" + username + ", email=" + email
				+ ", upoint=" + upoint + ", indate=" + indate + "]";
	}
	

}
