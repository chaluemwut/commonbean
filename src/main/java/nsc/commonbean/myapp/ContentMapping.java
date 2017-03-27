package nsc.commonbean.myapp;

import java.io.Serializable;

public class ContentMapping implements Serializable {
	private int productId;
	private int groupId;
	private String productName;
	private String detail;
	private int numberOfImage;
	private int price;
	
	private int dashboardFlag;
	private int discountPrice;
	

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

	@Override
	public String toString() {
		return "ContentMapping{" +
				"productId=" + productId +
				", groupId=" + groupId +
				", productName='" + productName + '\'' +
				", detail='" + detail + '\'' +
				", numberOfImage=" + numberOfImage +
				", price=" + price +
				", dashboardFlag=" + dashboardFlag +
				", discountPrice=" + discountPrice +
				'}';
	}
}
