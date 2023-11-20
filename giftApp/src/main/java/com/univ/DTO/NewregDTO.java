package com.univ.DTO;

public class NewregDTO {
	String Cname,Cadd,email,unm,pw;
	
	int Cid;
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		this.Cid = cid;
	}
	long mob;
	
	public NewregDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void NewRegDTO(String cname, String cadd, String email, String unm, String pw, long mob) {
		//super();
		this.Cname = cname;
		this.Cadd = cadd;
		this.email = email;
		this.unm = unm;
		this.pw = pw;
		this.mob = mob;
	}

	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		this.Cname = cname;
	}
	public String getCadd() {
		return Cadd;
	}
	public void setCadd(String cadd) {
		this.Cadd = cadd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUnm() {
		return unm;
	}
	public void setUnm(String unm) {
		this.unm = unm;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;}
	}
	

