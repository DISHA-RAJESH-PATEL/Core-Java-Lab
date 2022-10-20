package com.EmployeeManagement;

import java.util.Scanner;

import com.EmployeeManagement.dao.EmployeeDao;
import com.EmployeeManagement.daoimpl.EmployeeDaoImpl;
import com.EmployeeManagement.model.Employee;

public class App {
	public static void menu() {
		System.out.println("");
		System.out.println("MENU:");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Search Employee");
		System.out.println("4. Display all the Employee Details");
		System.out.println("5.Exit");
		System.out.println("");
	}

	public static void main(String[] args) {

		// creating Scanner Object
		Scanner sc1 = new Scanner(System.in);
		// creating object of impl
		EmployeeDao company = new EmployeeDaoImpl();

		try {
			int ch = 0;
			do {
				menu();
				ch = sc1.nextInt();
				Object ee;
				switch (ch) {
				case 1:
					company.addEmployee();
					System.out.println("");
					System.out.println("Employee data added successfully ");
					break;
				case 2:
					System.out.println("Enter the Id you want to  deleted:");
					int id = sc1.nextInt();
					boolean flag = company.deleteEmployee(id);
					if (flag)
						System.out.println("Employee deleted successfully");
					else
						System.out.println("Cannot find Employee in the data");
					break;

				case 3:
					ee = null;
					System.out.println("Enter the Id you want to search:");
					id = sc1.nextInt();
					ee = company.searchEmployee(id);
					if (ee == null)
						System.out.println("Employee not found in the data");
					else
						System.out.println("Employee Id :" + ((Employee) ee).getId() + "  Name:"
								+ ((Employee) ee).getName() + "   salary:" + ((Employee) ee).getSalary());
					break;

				case 4:
					company.displayAll();
					break;

				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid input.Try Again");

				}

			} while (ch != 6);

			// end of do while

			sc1.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
