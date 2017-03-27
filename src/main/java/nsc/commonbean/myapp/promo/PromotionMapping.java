package nsc.commonbean.myapp.promo;

import java.util.Date;

public class PromotionMapping {
	private int id;
	private String title;
	private String message;
	private int likeCount;
	private int shareCount;
	private Date createDate;
	private boolean isUploadImage;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public boolean isUploadImage() {
		return isUploadImage;
	}
	public void setUploadImage(boolean isUploadImage) {
		this.isUploadImage = isUploadImage;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public int getShareCount() {
		return shareCount;
	}

	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}
}
