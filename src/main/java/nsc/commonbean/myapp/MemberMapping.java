package nsc.commonbean.myapp;

import java.io.Serializable;

public class MemberMapping implements Serializable {
	private int userId;
	private int role;
	private int companyId;
	private String companyName;
	private int companyPackage;
	private Integer planTypeId;
	private int nextPlanTypeId;
	private String nextPlanTypeName;
	private String resourceId;
	private int themeId;
	private String updateId;
	private String lang;

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

    public Integer getPlanTypeId() {
        return planTypeId;
    }

    public void setPlanTypeId(Integer planTypeId) {
        this.planTypeId = planTypeId;
    }

    public int getNextPlanTypeId() {
		return nextPlanTypeId;
	}

	public void setNextPlanTypeId(int nextPlanTypeId) {
		this.nextPlanTypeId = nextPlanTypeId;
	}

	public String getNextPlanTypeName() {
		return nextPlanTypeName;
	}

	public void setNextPlanTypeName(String nextPlanTypeName) {
		this.nextPlanTypeName = nextPlanTypeName;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
