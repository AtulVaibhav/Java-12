package com.basics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Employee{
	int empId;
	String empName;
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
	
	
}
public class ClassLevelInfo {

	public static void main(String[] args) {
		Employee e = new Employee();
		
		Class obj = e.getClass();
		System.out.println(obj);
		
		Method[] declaredMethods = obj.getDeclaredMethods();
		
		for(Method m :declaredMethods) {
			System.out.println(m.getName());
		}
		
Field[] declaredFields = obj.getDeclaredFields();
		
		for(Field m :declaredFields) {
			System.out.println(m.getName());
		}
		

	}

}
