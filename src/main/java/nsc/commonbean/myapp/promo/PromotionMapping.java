package nsc.commonbean.myapp.promo;

import java.io.Serializable;
import java.util.Date;

public class PromotionMapping implements Serializable {
	private int id;
	private String title;
	private String message;
//	private int showDashboard;
	private int likeCount;
	private int shareCount;
	private Date createDate;
	private String resourceId;
	private boolean isLike;
	private boolean isShare;
    private String posterFullName;
    private String posterResourceId;
	
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

	public boolean isLike() {
		return isLike;
	}

	public void setLike(boolean like) {
		isLike = like;
	}

	public boolean isShare() {
		return isShare;
	}

	public void setShare(boolean share) {
		isShare = share;
	}

    public String getPosterFullName() {
        return posterFullName;
    }

    public void setPosterFullName(String posterFullName) {
        this.posterFullName = posterFullName;
    }

    public String getPosterResourceId() {
        return posterResourceId;
    }

    public void setPosterResourceId(String posterResourceId) {
        this.posterResourceId = posterResourceId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

//    public int getShowDashboard() {
//        return showDashboard;
//    }
//
//    public void setShowDashboard(int showDashboard) {
//        this.showDashboard = showDashboard;
//    }
}
