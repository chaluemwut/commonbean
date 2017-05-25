package nsc.commonbean.myapp;

import java.io.Serializable;
import java.util.Date;

public class SettingMapping implements Serializable {
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
}
