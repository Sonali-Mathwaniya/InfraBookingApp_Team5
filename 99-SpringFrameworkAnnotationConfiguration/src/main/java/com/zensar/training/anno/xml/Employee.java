package com.zensar.training.anno.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    
	
	@Autowired
    @Qualifier
	private Department department;
     
   
    
    public Employee() {
		super();
		
		
		System.out.println("default construcotr");
	}
	
    
    
    
    
    public Employee(Department department) {
		
		super();
		
		
		System.out.println("pera construcotr");

		this.department = department;
	}
    
    
    
    
	public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
    	
    	System.out.println("Employee setter method");
        this.department = department;
    }
     
	
    
    
    
    @Override
	public String toString() {
		return "Employee [department=" + department + "]";
	}
    
    
    
    
    
}