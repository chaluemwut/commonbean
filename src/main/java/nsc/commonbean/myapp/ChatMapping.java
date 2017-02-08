package nsc.commonbean.myapp;

import java.io.Serializable;
import java.util.Date;

public class ChatMapping implements Serializable {
	private static final long serialVersionUID = -6968470245243894069L;

	private int id;
	private String message;
	private Date createDate;
	private String userName;
	private int userChatId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserChatId() {
		return userChatId;
	}

	public void setUserChatId(int userChatId) {
		this.userChatId = userChatId;
	}
}
