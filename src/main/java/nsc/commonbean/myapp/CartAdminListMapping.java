package nsc.commonbean.myapp;

import java.io.Serializable;
import java.util.Date;

public class CartAdminListMapping implements Serializable {
	private int sellId;
	private String buyerName;
	private String productName;
	private int sellStatus;
	private Date createDate;
	private boolean isNSCApp;

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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

    public boolean isNSCApp() {
        return isNSCApp;
    }

    public void setNSCApp(boolean NSCApp) {
        isNSCApp = NSCApp;
    }
}
