package com.EmployeeManagement.dao;

public interface EmployeeDao {

	void addEmployee();

	boolean deleteEmployee(int id);

	void displayAll();

	Object searchEmployee(int id);

}
