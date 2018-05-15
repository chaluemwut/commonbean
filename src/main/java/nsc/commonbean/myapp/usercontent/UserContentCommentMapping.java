package nsc.commonbean.myapp.usercontent;

import java.io.Serializable;

/**
 * Created by chaluemwutnoyunsan on 3/22/17.
 */
public class UserContentCommentMapping implements Serializable {
    private int id;
    private String message;
    private int userId;
    private String userName;
    private String profileResourceId;

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfileResourceId() {
        return profileResourceId;
    }

    public void setProfileResourceId(String profileResourceId) {
        this.profileResourceId = profileResourceId;
    }
}
