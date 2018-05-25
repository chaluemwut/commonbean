package nsc.commonbean.myapp;

import java.io.Serializable;

public class CompanyUpdateMapping implements Serializable {
	public boolean isUpdate;
	public String updateId;

	public boolean isUpdate() {
		return isUpdate;
	}
	public void setUpdate(boolean isUpdate) {
		this.isUpdate = isUpdate;
	}
	public String getUpdateId() {
		return updateId;
	}
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}


}
