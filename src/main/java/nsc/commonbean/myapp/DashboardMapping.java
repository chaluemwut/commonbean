package nsc.commonbean.myapp;

import nsc.commonbean.myapp.promo.PromotionMapping;
import nsc.commonbean.myapp.usercontent.UserContentMapping;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class DashboardMapping implements Serializable {
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
//
//    public int compareTo(Object o) {
//        DashboardMapping otherObj = (DashboardMapping)o;
//        if(this.getCreateDate().equals(otherObj.getCreateDate())){
//            return 0;
//        } else if (this.getCreateDate().after(otherObj.getCreateDate())) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "DashboardMapping{" +
//                "dashBoardType=" + dashBoardType +
//                ", userContentMapping=" + userContentMapping +
//                ", contentMapping=" + contentMapping +
//                ", promotionMapping=" + promotionMapping +
//                ", createDate=" + createDate +
//                '}';
//    }

}
