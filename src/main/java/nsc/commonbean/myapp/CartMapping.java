package nsc.commonbean.myapp;

import java.io.Serializable;
import java.math.BigDecimal;

public class CartMapping implements Serializable {
	private static final long serialVersionUID = 6095518057173637022L;
	
	private int productId;
    private String productName;
    private BigDecimal price;
    private int itemCount;
    
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
    
}
