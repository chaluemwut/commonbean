package nsc.commonbean.myapp.setup;

import java.io.Serializable;
import java.util.Date;

public class ServiceType implements Serializable {

	private static final long serialVersionUID = -5313100726836903787L;

	private int id;

	private String name;

	private String detail;

	private Date createDate;

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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
