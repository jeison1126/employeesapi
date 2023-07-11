package com.emp.model;

public class Employee {
	
	private long  id;
	
	private String employee_name;
	
	private long employee_salary;
	
	private long employee_anual_salary;
	
	private long employee_age;
	
	private String perfil_image;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public long getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(long employee_salary) {
		this.employee_salary = employee_salary;
	}
	public long getEmployee_anual_salary() {
		return employee_anual_salary;
	}
	public void setEmployee_anual_salary(long employee_anual_salary) {
		this.employee_anual_salary = employee_anual_salary;
	}
	public long getEmployee_age() {
		return employee_age;
	}
	public void setEmployee_age(long employee_age) {
		this.employee_age = employee_age;
	}
	public String getPerfil_image() {
		return perfil_image;
	}
	public void setPerfil_image(String perfil_image) {
		this.perfil_image = perfil_image;
	}

}
