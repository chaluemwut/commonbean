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
    private String companyAdminUserName;
    private int companyAdminUserId;

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

    public String getCompanyAdminUserName() {
        return companyAdminUserName;
    }

    public void setCompanyAdminUserName(String companyAdminUserName) {
        this.companyAdminUserName = companyAdminUserName;
    }

    public int getCompanyAdminUserId() {
        return companyAdminUserId;
    }

    public void setCompanyAdminUserId(int companyAdminUserId) {
        this.companyAdminUserId = companyAdminUserId;
    }
}
