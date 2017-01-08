package nsc.commonbean.myapp;

import java.io.Serializable;

public class ContentMapping implements Serializable {
	private static final long serialVersionUID = -2820415613504501173L;
	private int productId;
	private String productName;
	private String detail;
	private int price;
	
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
	
	
}
