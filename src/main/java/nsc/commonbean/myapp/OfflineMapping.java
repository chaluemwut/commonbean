package nsc.commonbean.myapp;

import java.io.Serializable;

public class OfflineMapping implements Serializable {
    private Integer themeId;
    private String splashResourceId;

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    public String getSplashResourceId() {
        return splashResourceId;
    }

    public void setSplashResourceId(String splashResourceId) {
        this.splashResourceId = splashResourceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfflineMapping that = (OfflineMapping) o;

        if (!themeId.equals(that.themeId)) return false;
        return splashResourceId.equals(that.splashResourceId);
    }

    @Override
    public int hashCode() {
        int result = themeId.hashCode();
        result = 31 * result + splashResourceId.hashCode();
        return result;
    }
}
