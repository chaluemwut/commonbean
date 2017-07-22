package nsc.commonbean.myapp;

import java.io.Serializable;

public class ContentGroupMapping implements Serializable {
	
	private int id;
	private String name;
	private String resourceId;
	private long createDate;
	private int contentGroupType;
	
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
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public int getContentGroupType() {
		return contentGroupType;
	}

	public void setContentGroupType(int contentGroupType) {
		this.contentGroupType = contentGroupType;
	}
}
