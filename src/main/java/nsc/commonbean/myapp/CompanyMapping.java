package nsc.commonbean.myapp;

import java.io.Serializable;

public class CompanyMapping implements Serializable{
	private int id;
	private String companyName;
	private String mobile;
	private String work;
	private String email;
	private String facebookURL;
	private String instrgramURL;
	private String latitude;
	private String longitude;

	private String dashboardResourceId1;
	private String dashboardResourceId2;
	private String dashboardResourceId3;

	private String resourceIdCompanyImage;
	
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFacebookURL() {
		return facebookURL;
	}
	public void setFacebookURL(String facebookURL) {
		this.facebookURL = facebookURL;
	}
	public String getInstrgramURL() {
		return instrgramURL;
	}
	public void setInstrgramURL(String instrgramURL) {
		this.instrgramURL = instrgramURL;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getResourceIdCompanyImage() {
		return resourceIdCompanyImage;
	}

	public void setResourceIdCompanyImage(String resourceIdCompanyImage) {
		this.resourceIdCompanyImage = resourceIdCompanyImage;
	}

	public String getDashboardResourceId1() {
		return dashboardResourceId1;
	}

	public void setDashboardResourceId1(String dashboardResourceId1) {
		this.dashboardResourceId1 = dashboardResourceId1;
	}

	public String getDashboardResourceId2() {
		return dashboardResourceId2;
	}

	public void setDashboardResourceId2(String dashboardResourceId2) {
		this.dashboardResourceId2 = dashboardResourceId2;
	}

	public String getDashboardResourceId3() {
		return dashboardResourceId3;
	}

	public void setDashboardResourceId3(String dashboardResourceId3) {
		this.dashboardResourceId3 = dashboardResourceId3;
	}
}
