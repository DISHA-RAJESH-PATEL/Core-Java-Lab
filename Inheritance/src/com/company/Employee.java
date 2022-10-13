package com.company;

public class Employee extends Hourly {
		private long id;
		private String name;
		private int salary;

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(long id, String name,int salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary=salary;
		}

		public long getid() {
			return id;
		}

		public void setid(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public int getsalary() {
			return salary;
		}

		public void setid(int salary) {
			this.salary = salary;
		}
		
		

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ",salary=" + salary + "]";
		}

	}



