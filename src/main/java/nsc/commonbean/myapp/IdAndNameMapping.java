package nsc.commonbean.myapp;

import java.io.Serializable;

public class IdAndNameMapping implements Serializable {
	private static final long serialVersionUID = -8161422920229486411L;	
	private int id;
	private String name;
	
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

}
