package nsc.commonbean.myapp;

import java.io.Serializable;
import java.util.Date;

public class Chat2Mapping implements Serializable {
    private int id;
    private String message;
    private String resourceId;
    private Date createDate;
    private String userName;
    private int userId;
    private String companyName;
    private Integer companyAdminId;
    private int chatType;

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

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getCompanyAdminId() {
        return companyAdminId;
    }

    public void setCompanyAdminId(Integer companyAdminId) {
        this.companyAdminId = companyAdminId;
    }

    public int getChatType() {
        return chatType;
    }

    public void setChatType(int chatType) {
        this.chatType = chatType;
    }
}
