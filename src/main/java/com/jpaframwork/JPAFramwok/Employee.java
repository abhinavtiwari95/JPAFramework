package com.jpaframwork.JPAFramwok;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empaddress=" + empaddress + "]";
	}
	@Id
	private int empid;
	private String empname;
	private String empaddress;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

}
