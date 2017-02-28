package nsc.commonbean.myapp;

import java.io.Serializable;
import java.util.List;

public class SellProcessMapping implements Serializable {
	private static final long serialVersionUID = -8279650033207817204L;	
    private String fullName;
    private String address;
    private String province;
    private String zip;
    private String phone;
    private String email;
    
    private List<CartMapping> cartList;

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

	public List<CartMapping> getCartList() {
		return cartList;
	}

	public void setCartList(List<CartMapping> cartList) {
		this.cartList = cartList;
	}

}
