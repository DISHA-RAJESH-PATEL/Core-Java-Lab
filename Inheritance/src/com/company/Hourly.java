package com.company;

public class Hourly {
	private long Hid;
	private String Hname;
	private int Hsalary;

	public Hourly() {
		super();
		// TODO Auto-generated constructor stub
	}

	public  Hourly(long Hid, String Hname,int Hsalary) {
		super();
		this.Hid = Hid;
		this.Hname = Hname;
		this.Hsalary=Hsalary;
	}

	public long getHid() {
		return Hid;
	}

	public void setid(long Hid) {
		this.Hid = Hid;
	}

	public String getHName() {
		return Hname;
	}

	public void setHName(String Hname) {
		this.Hname = Hname;
	}
	public int getHsalary() {
		return Hsalary;
	}

	public void setid(int Hsalary) {
		this.Hsalary = Hsalary;
	}
	
	

	@Override
	public String toString() {
		return " Hourly [Hid=" + Hid + ", Hname=" + Hname + ",Hsalary=" + Hsalary + "]";
	}


}
