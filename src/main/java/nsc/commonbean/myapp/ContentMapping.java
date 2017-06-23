package nsc.commonbean.myapp;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class ContentMapping implements Serializable {
	private int productId;
	private int groupId;
	private String productName;
	private String detail;
	private int numberOfImage;
	private int price;
	private int numberOfItem;
	private int contentType;
	
	private int dashboardFlag;
	private int discountPrice;

	private String resourceId;
	private Set<String> resourceIdSet;

	private Date createDate;
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumberOfImage() {
		return numberOfImage;
	}

	public void setNumberOfImage(int numberOfImage) {
		this.numberOfImage = numberOfImage;
	}

	public int getDashboardFlag() {
		return dashboardFlag;
	}

	public void setDashboardFlag(int dashboardFlag) {
		this.dashboardFlag = dashboardFlag;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public Set<String> getResourceIdSet() {
		return resourceIdSet;
	}

	public void setResourceIdSet(Set<String> resourceIdSet) {
		this.resourceIdSet = resourceIdSet;
	}

	public int getNumberOfItem() {
		return numberOfItem;
	}

	public void setNumberOfItem(int numberOfItem) {
		this.numberOfItem = numberOfItem;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getContentType() {
		return contentType;
	}

	public void setContentType(int contentType) {
		this.contentType = contentType;
	}
}
