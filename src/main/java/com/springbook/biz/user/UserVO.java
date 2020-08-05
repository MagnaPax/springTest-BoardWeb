package com.springbook.biz.user;

public class UserVO {
	private int uidx;
	private String uname;
	private String userid;
	private String userpw;
	private String uemail;
	private int ustat;
	private int uauth;
	public int getUidx() {
		return uidx;
	}
	public void setUidx(int uidx) {
		this.uidx = uidx;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public int getUstat() {
		return ustat;
	}
	public void setUstat(int ustat) {
		this.ustat = ustat;
	}
	public int getUauth() {
		return uauth;
	}
	public void setUauth(int uauth) {
		this.uauth = uauth;
	}
	
	@Override
	public String toString() {
		return "UserVO [uidx="+uidx+
				"uname="+uname+
				"userid="+userid+
				"userpw="+userpw+
				"uemail="+uemail+
				"ustat="+ustat+
				"uauth="+uauth+"]";
	}
	
}
