package nsc.commonbean.myapp;

import java.io.Serializable;

public class MemberMapping implements Serializable{
	private static final long serialVersionUID = -4416251441320316997L;
	
	private int role;

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

}
