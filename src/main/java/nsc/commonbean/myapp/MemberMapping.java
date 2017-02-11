package nsc.commonbean.myapp;

import java.io.Serializable;

public class MemberMapping implements Serializable{
	private static final long serialVersionUID = -4416251441320316997L;
	private int userId;
	private int role;
	private String companyId;

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

}
