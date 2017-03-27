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
	
	private boolean dashboardImage1;
	private boolean dashboardImage2;
	private boolean dashboardImage3;	
	
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
	public boolean isDashboardImage1() {
		return dashboardImage1;
	}
	public void setDashboardImage1(boolean dashboardImage1) {
		this.dashboardImage1 = dashboardImage1;
	}
	public boolean isDashboardImage2() {
		return dashboardImage2;
	}
	public void setDashboardImage2(boolean dashboardImage2) {
		this.dashboardImage2 = dashboardImage2;
	}
	public boolean isDashboardImage3() {
		return dashboardImage3;
	}
	public void setDashboardImage3(boolean dashboardImage3) {
		this.dashboardImage3 = dashboardImage3;
	}
}
