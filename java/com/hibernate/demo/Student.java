package com.hibernate.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int stId;
	private String stName;
	private String stAdd;
	private int stPhone;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stId, String stName, String stAdd, int stPhone) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.stAdd = stAdd;
		this.stPhone = stPhone;
	}
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStAdd() {
		return stAdd;
	}
	public void setStAdd(String stAdd) {
		this.stAdd = stAdd;
	}
	public int getStPhone() {
		return stPhone;
	}
	public void setStPhone(int stPhone) {
		this.stPhone = stPhone;
	}
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", stAdd=" + stAdd + ", stPhone=" + stPhone + "]";
	}
	
}
