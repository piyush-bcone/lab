package com.spring.services;
import com.spring.beans.Employee;
/*
 *Custom init() and destroy() methods in bean configuration file
 */
public class MyEmployeeService{

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public MyEmployeeService(){
		System.out.println("MyEmployeeService no-args constructor called");
	}

	//pre-destroy method
	public void destroy() throws Exception {
		System.out.println("MyEmployeeService Closing resources");
	}

	//post-init method
	public void init() throws Exception {
		System.out.println("MyEmployeeService initializing to dummy value");
		if(employee.getName() == null){
			employee.setName("Pankaj");
		}
	}
}