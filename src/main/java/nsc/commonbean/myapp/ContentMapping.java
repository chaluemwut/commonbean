package nsc.commonbean.myapp;

import java.io.Serializable;
import java.math.BigDecimal;

public class ContentMapping implements Serializable {
	private static final long serialVersionUID = -2820415613504501173L;
	private int productId;
	private String productName;
	private String detail;
	private int numberOfImage;
	private BigDecimal price;
	
	private boolean suggest;
	private int discount;
	private boolean newProduct;
	private boolean showToDashboard;	
	

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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getNumberOfImage() {
		return numberOfImage;
	}

	public void setNumberOfImage(int numberOfImage) {
		this.numberOfImage = numberOfImage;
	}

	public boolean getSuggest() {
		return suggest;
	}

	public void setSuggest(boolean suggest) {
		this.suggest = suggest;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public boolean getNewProduct() {
		return newProduct;
	}

	public void setNewProduct(boolean newProduct) {
		this.newProduct = newProduct;
	}

	public boolean getShowToDashboard() {
		return showToDashboard;
	}

	public void setShowToDashboard(boolean showToDashboard) {
		this.showToDashboard = showToDashboard;
	}


}
