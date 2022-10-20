package com.EmployeeManagement.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.EmployeeManagement.dao.EmployeeDao;
import com.EmployeeManagement.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	List<Employee> eList = new ArrayList<Employee>();

	// creating Scanner Object
	Scanner sc = new Scanner(System.in);

	// To Add Employee
	public void addEmployee() {

		// creating Employee object
		Employee ee = new Employee();

		// input the details of Employee
		System.out.println("Enter id :");
		ee.setId(sc.nextInt());

		System.out.println("Enter name :");
		ee.setName(sc.next());

		System.out.println("Enter Middle name :");
		ee.setMiddlename(sc.next());

		System.out.println("Enter Surname :");
		ee.setSurname(sc.next());

		System.out.println("Enter salary :");
		ee.setSalary(sc.nextInt());

		// adding the Employee into the collection
		eList.add(ee);
		System.out.println(eList);

	}

	// to delete Employee
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		Employee edel = null;
		// finding Employee
		for (Employee e : eList) {
			if (e.getId() == id)
				edel = e;
		}
		// check whether the record is present
		if (edel == null)
			status = false;
		else {
			eList.remove(edel);
			status = true;
		}

		return status;
	}

	// to search
	public Employee searchEmployee(int id) {

		Employee efind = null;

		// finding the Employee
		for (Employee e : eList) {
			if (e.getId() == id)
				efind = e;
		}

		return efind;
	}

	// To display details
	public void displayAll() {

		for (Employee e : eList) {
			System.out.println(e);
		}

	}

}
