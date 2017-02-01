package nsc.commonbean.myapp.usercontent;

import java.util.Date;

public class UserContentMapping {	
	private int id;
	private String fullUserName;
	private String message;
	private Date createDate;
	private int likeCount;
	private int commentCount;
	private int shareCount;
	
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
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public int getShareCount() {
		return shareCount;
	}
	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}
	public String getFullUserName() {
		return fullUserName;
	}
	public void setFullUserName(String fullUserName) {
		this.fullUserName = fullUserName;
	}
	
	@Override
	public String toString() {
		return "UserContentMapping [id=" + id + ", fullUserName=" + fullUserName + ", message=" + message
				+ ", createDate=" + createDate + ", likeCount=" + likeCount + ", commentCount=" + commentCount
				+ ", shareCount=" + shareCount + "]";
	}
	
}
