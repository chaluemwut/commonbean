package nsc.commonbean.myapp;

import java.io.Serializable;

public class UICompanyListMapping implements Serializable {
    private int id;
    private String name;
    private String packageName;
    private String buyStatus;
    private int diskUsage;
    private int dayUsage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getBuyStatus() {
        return buyStatus;
    }

    public void setBuyStatus(String buyStatus) {
        this.buyStatus = buyStatus;
    }

    public int getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(int diskUsage) {
        this.diskUsage = diskUsage;
    }

    public int getDayUsage() {
        return dayUsage;
    }

    public void setDayUsage(int dayUsage) {
        this.dayUsage = dayUsage;
    }
}
