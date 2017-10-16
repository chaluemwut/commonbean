package nsc.commonbean.myapp;

import nsc.commonbean.myapp.promo.PromotionMapping;
import nsc.commonbean.myapp.usercontent.UserContentMapping;

import java.util.Date;

public class DashboardMapping {
    private int dashBoardType;
    private UserContentMapping userContentMapping;
    private ContentMapping contentMapping;
    private PromotionMapping promotionMapping;
    private Date createDate;

    public int getDashBoardType() {
        return dashBoardType;
    }

    public void setDashBoardType(int dashBoardType) {
        this.dashBoardType = dashBoardType;
    }

    public UserContentMapping getUserContentMapping() {
        return userContentMapping;
    }

    public void setUserContentMapping(UserContentMapping userContentMapping) {
        this.userContentMapping = userContentMapping;
    }

    public ContentMapping getContentMapping() {
        return contentMapping;
    }

    public void setContentMapping(ContentMapping contentMapping) {
        this.contentMapping = contentMapping;
    }

    public PromotionMapping getPromotionMapping() {
        return promotionMapping;
    }

    public void setPromotionMapping(PromotionMapping promotionMapping) {
        this.promotionMapping = promotionMapping;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
