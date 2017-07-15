package nsc.commonbean.myapp;

import java.io.Serializable;

public class MemberMapping implements Serializable {
	private int userId;
	private int role;
	private int companyId;
	private String companyName;
	private int companyPackage;
	private String resourceId;
	private int themeId;


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

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getCompanyPackage() {
		return companyPackage;
	}

	public void setCompanyPackage(int companyPackage) {
		this.companyPackage = companyPackage;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public int getThemeId() {
		return themeId;
	}

	public void setThemeId(int themeId) {
		this.themeId = themeId;
	}
}
