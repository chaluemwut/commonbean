package nsc.commonbean.myapp.setup;

import java.io.Serializable;


public class ProgramTypeMapping implements Serializable {
	private static final long serialVersionUID = -8494573407370122720L;
	
	private int id;
	private String name;	
	private int displayOrder;
	private int activityType;	
	private String detail;
	private int requireLogin;
	private int usageRole;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}
	public int getActivityType() {
		return activityType;
	}
	public void setActivityType(int activityType) {
		this.activityType = activityType;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getRequireLogin() {
		return requireLogin;
	}
	public void setRequireLogin(int requireLogin) {
		this.requireLogin = requireLogin;
	}
	
	public int getUsageRole() {
		return usageRole;
	}

	public void setUsageRole(int usageRole) {
		this.usageRole = usageRole;
	}

}
