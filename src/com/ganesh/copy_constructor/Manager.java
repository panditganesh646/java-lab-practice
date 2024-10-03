package com.ganesh.copy_constructor;

public class Manager {
    private int managerId;
    private String managerName;
    public Manager(Employee emp) {
    	  this.managerId = emp.getEmployeeId();
    	  this.managerName = emp.getEmployeeName();
    }
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}
    
    
}
