package nsc.commonbean.myapp;

import java.io.Serializable;

public class ContentGroupMapping implements Serializable {
	private static final long serialVersionUID = 4307386981022390472L;
	
	private int id;
	private String name;
	private String resourceId;
	private boolean isUploadImage;
	private long createDate;
	
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
	public long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}
	public boolean isUploadImage() {
		return isUploadImage;
	}
	public void setUploadImage(boolean isUploadImage) {
		this.isUploadImage = isUploadImage;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
}
