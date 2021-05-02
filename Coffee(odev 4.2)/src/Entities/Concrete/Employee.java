package Entities.Concrete;

import Entities.Abstract.Entity;

public class Employee extends Customer implements Entity {
	
	String employeeNum;

	public String getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
}
