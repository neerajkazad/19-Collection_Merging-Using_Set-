package com.cm.beans;

import java.util.Set;

public class Company {
	private Set<String> employeeId;

	public void setEmployeeId(Set<String> employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Company [employeeId=" + employeeId + "]";
	}
	
	
}
