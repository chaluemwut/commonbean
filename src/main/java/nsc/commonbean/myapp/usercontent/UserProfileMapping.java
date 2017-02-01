package nsc.commonbean.myapp.usercontent;

import java.io.Serializable;

public class UserProfileMapping implements Serializable {
	private static final long serialVersionUID = -1967725592032357778L;
	private String fullName;
	private int contentCount;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getContentCount() {
		return contentCount;
	}
	public void setContentCount(int contentCount) {
		this.contentCount = contentCount;
	}
	@Override
	public String toString() {
		return "UserProfileMapping [fullName=" + fullName + ", contentCount=" + contentCount + "]";
	}
}
