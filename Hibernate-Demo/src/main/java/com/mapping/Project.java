package com.mapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	@Column(name="pro_Id")
	private int proId;
	private String proName;
	@ManyToMany(mappedBy = "projects")
	private List<Emp> employee;
	
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public List<Emp> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Emp> employee) {
		this.employee = employee;
	}
	
	
}
