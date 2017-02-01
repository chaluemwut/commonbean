package nsc.commonbean.myapp.usercontent;

import java.io.Serializable;

public class UserProfileMapping implements Serializable {
	private static final long serialVersionUID = -1967725592032357778L;
	private String fullName;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
}
