package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private Integer payDay;
	
	Address contact;
			
	List<Employee> employees = new ArrayList<>();
	
	public Department(String name, Integer payDay, Address contact) {
		this.name = name;
		this.payDay = payDay;
		this.contact = contact;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getContact() {
		return contact;
	}

	public void setContact(Address contact) {
		this.contact = contact;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee employee) {
		 employees.add(employee);
	}
	
	public void removeEmployee(Employee employee){
		employees.remove(employee);
	}
	
	//soma de todos os salarios dos empregados
	public double payRoll() {
		double soma=0;
		for(Employee val : employees) {
			soma += val.getSalary();
		}
		return  soma;
	}
}
