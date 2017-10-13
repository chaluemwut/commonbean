package nsc.commonbean.myapp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class SellProcessMapping implements Serializable {
	private int id;
    private String fullName;
    private String address;
    private String province;
    private String zip;
    private String phone;
    private String email;
    
    private String bankName;
    private String bankAccountName;
    private String bankAccountNumber;
    
    private String storeName;
    private String storeAdminName;
    private String storeAdminPassword;
    private String adminAddress;
    private String adminPhone;
    
    private int paymentMethod;    
    private int deliveryFee;
    
    private int status;

    private String billResourceId;
    
    private Set<CartMapping> cartList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<CartMapping> getCartList() {
		return cartList;
	}

	public void setCartList(Set<CartMapping> cartList) {
		this.cartList = cartList;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAccountName() {
		return bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getDeliveryFee() {
		return deliveryFee;
	}

	public void setDeliveryFee(int deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAdminName() {
		return storeAdminName;
	}

	public void setStoreAdminName(String storeAdminName) {
		this.storeAdminName = storeAdminName;
	}

	public String getStoreAdminPassword() {
		return storeAdminPassword;
	}

	public void setStoreAdminPassword(String storeAdminPassword) {
		this.storeAdminPassword = storeAdminPassword;
	}

	public String getAdminAddress() {
		return adminAddress;
	}

	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}

	public String getAdminPhone() {
		return adminPhone;
	}

	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}

    public String getBillResourceId() {
        return billResourceId;
    }

    public void setBillResourceId(String billResourceId) {
        this.billResourceId = billResourceId;
    }
}
