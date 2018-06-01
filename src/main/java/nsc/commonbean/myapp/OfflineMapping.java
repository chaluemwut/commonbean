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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((splashResourceId == null) ? 0 : splashResourceId.hashCode());
		result = prime * result + ((themeId == null) ? 0 : themeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OfflineMapping other = (OfflineMapping) obj;
		if (splashResourceId == null) {
			if (other.splashResourceId != null) {
				return false;
			}
		} else if (!splashResourceId.equals(other.splashResourceId)) {
			return false;
		}

		if (themeId == null) {
			if (other.themeId != null) {
				return false;
			}
		} else if (!themeId.equals(other.themeId)) {
			return false;
		}
		return true;
	}

}
