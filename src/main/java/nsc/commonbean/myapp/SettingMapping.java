package nsc.commonbean.myapp;

import java.io.Serializable;
import java.util.Date;

public class SettingMapping implements Serializable {
    private int buyStatus;
    private String buyStatusName;
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

    public int getBuyStatus() {
        return buyStatus;
    }

    public void setBuyStatus(int buyStatus) {
        this.buyStatus = buyStatus;
    }

    public String getBuyStatusName() {
        return buyStatusName;
    }

    public void setBuyStatusName(String buyStatusName) {
        this.buyStatusName = buyStatusName;
    }
}
