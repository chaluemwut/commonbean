package nsc.commonbean.myapp.usercontent;

import java.io.Serializable;
import java.util.Date;

public class UserContentMapping implements Serializable {
	private int id;
	private String fullUserName;
	private String userName;
	private int userId;
	private String message;
	private Date createDate;
	private String resourceId;
	private int likeCount;
	private int commentCount;
	private int shareCount;
	private String userLocale;	

	private boolean isLikeToPost;
	private boolean isCommentToPost;
	private boolean isShareToPost;
	
	private String contentResourceId;
	
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

	public boolean isLikeToPost() {
		return isLikeToPost;
	}

	public void setLikeToPost(boolean likeToPost) {
		isLikeToPost = likeToPost;
	}

	public boolean isCommentToPost() {
		return isCommentToPost;
	}

	public void setCommentToPost(boolean commentToPost) {
		isCommentToPost = commentToPost;
	}

	public boolean isShareToPost() {
		return isShareToPost;
	}

	public void setShareToPost(boolean shareToPost) {
		isShareToPost = shareToPost;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserLocale() {
		return userLocale;
	}

	public void setUserLocale(String userLocale) {
		this.userLocale = userLocale;
	}
	public String getContentResourceId() {
		return contentResourceId;
	}
	public void setContentResourceId(String contentResourceId) {
		this.contentResourceId = contentResourceId;
	}
	
}
