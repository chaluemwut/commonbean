package nsc.commonbean.myapp;

import java.io.Serializable;
import java.util.Date;

public class SettingMapping implements Serializable {
    private int buyStatusId;
    private int planTypeId;
    private Date dateExpire;
    private int usage;
    private int limit;

    public Date getDateExpire() {
        return dateExpire;
    }

    public void setDateExpire(Date dateExpire) {
        this.dateExpire = dateExpire;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getBuyStatusId() {
        return buyStatusId;
    }

    public void setBuyStatusId(int buyStatusId) {
        this.buyStatusId = buyStatusId;
    }

    public int getPlanTypeId() {
        return planTypeId;
    }

    public void setPlanTypeId(int planTypeId) {
        this.planTypeId = planTypeId;
    }
}
