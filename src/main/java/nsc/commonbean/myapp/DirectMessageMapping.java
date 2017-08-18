package nsc.commonbean.myapp;

import java.sql.Date;

public class DirectMessageMapping {	
	private String message;
	private TinyMemberMapping formUser;
	private TinyMemberMapping toUser;
	private Date createDate;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public TinyMemberMapping getFormUser() {
		return formUser;
	}
	public void setFormUser(TinyMemberMapping formUser) {
		this.formUser = formUser;
	}
	public TinyMemberMapping getToUser() {
		return toUser;
	}
	public void setToUser(TinyMemberMapping toUser) {
		this.toUser = toUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
