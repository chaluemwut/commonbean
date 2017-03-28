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
	private boolean isUploadImage;
	private int likeCount;
	private int commentCount;
	private int shareCount;

	private boolean isLikeToPost;
	private boolean isCommentToPost;
	private boolean isShareToPost;
	
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

	public boolean isUploadImage() {
		return isUploadImage;
	}

	public void setUploadImage(boolean uploadImage) {
		isUploadImage = uploadImage;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
