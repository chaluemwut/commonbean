package nsc.commonbean.myapp.usercontent;

import java.io.Serializable;

/**
 * Created by chaluemwutnoyunsan on 3/22/17.
 */
public class FriendMapping implements Serializable {
    private int id;
    private String fullName;
    private String profileTitle;
    private boolean hasPictureProfile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProfileTitle() {
        return profileTitle;
    }

    public void setProfileTitle(String profileTitle) {
        this.profileTitle = profileTitle;
    }

    public boolean isHasPictureProfile() {
        return hasPictureProfile;
    }

    public void setHasPictureProfile(boolean hasPictureProfile) {
        this.hasPictureProfile = hasPictureProfile;
    }
}
