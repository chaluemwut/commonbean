package nsc.commonbean.myapp;

import java.io.Serializable;

public class TinyCompanyMapping implements Serializable {
	private static final long serialVersionUID = -5547862162554423430L;
	private int id;
	private String companyName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
