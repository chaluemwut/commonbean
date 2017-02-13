package nsc.commonbean.myapp;

import java.io.Serializable;
import java.math.BigDecimal;

public class BuyListMapping implements Serializable {
	private static final long serialVersionUID = -1210984722949450140L;
	
	private int id;
	private String name;
	private int itemCount;
	private BigDecimal price;
	
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
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}


}
