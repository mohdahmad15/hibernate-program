package com.mapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Emp {

	@Id
	@Column(name="emp_id")
	private int empId;
	private String empName;
	@ManyToMany
	@JoinTable(name="emp_Learn",joinColumns= {@JoinColumn(name="eid")},inverseJoinColumns={@JoinColumn(name="pid")})
	private List<Project> projects;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
}
