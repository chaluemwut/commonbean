package nsc.commonbean.myapp;

import java.io.Serializable;

public class CartAdminListMapping implements Serializable {
	private static final long serialVersionUID = -8161422920229486411L;

	private int sellId;
	private String buyerName;
	private int sellStatus;
	
	public int getSellId() {
		return sellId;
	}
	public void setSellId(int sellId) {
		this.sellId = sellId;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public int getSellStatus() {
		return sellStatus;
	}
	public void setSellStatus(int sellStatus) {
		this.sellStatus = sellStatus;
	}
	
	
}
