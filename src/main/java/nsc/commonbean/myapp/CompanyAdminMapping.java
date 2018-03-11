package nsc.commonbean.myapp;

import java.io.Serializable;

public class CompanyAdminMapping extends CompanyMapping implements Serializable {
    private int diskUsage;

    public int getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(int diskUsage) {
        this.diskUsage = diskUsage;
    }
}
