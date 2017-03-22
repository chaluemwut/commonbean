package nsc.commonbean.myapp.usercontent;

import java.io.Serializable;

public class UserProfileMapping implements Serializable {
	private static final long serialVersionUID = -1967725592032357778L;

    private String fullName;
	private String userName;
	private String profileTitle;

	private int friendCount;
	private int contentCount;
	private int favoriteCount;
	private int likeCount;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getContentCount() {
		return contentCount;
	}
	public void setContentCount(int contentCount) {
		this.contentCount = contentCount;
	}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfileTitle() {
        return profileTitle;
    }

    public void setProfileTitle(String profileTitle) {
        this.profileTitle = profileTitle;
    }

    public int getFriendCount() {
        return friendCount;
    }

    public void setFriendCount(int friendCount) {
        this.friendCount = friendCount;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
}
