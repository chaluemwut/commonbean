package nsc.commonbean.myapp;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by chaluemwutnoyunsan on 3/24/17.
 */
public class FollowerUserMapping implements Serializable {
    private int id;
    private String fullName;
    private String resourceId;
    private Date createDate;

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
}
