package com.nissan.project.corejava.utility;

public class User {
	private String name;
	private String eid;
	private long Contactno;
	private String uname;
	private String password;

	public User(String name,String eid,long Contactno,String uname,String password)
	{
		this.name=name;
		this.eid=eid;
		this.Contactno=Contactno;
		this.uname=uname;
		this.password=password;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public long getContactno() {
		return Contactno;
	}

	public void setContactno(long contactno) {
		Contactno = contactno;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		
		return "name :"+ this.name +"\nEmail id :"+this.eid+"username :"+this.uname+"\npassword :"+this.password;
	}
	
	public boolean verify(String unm,String pswd)
	{
		if(this.uname.equals(unm)&&this.password.equals(pswd))
			return true;
		else
			return false;
	}
}
