package com.FeesManagement;

//importing packages
//importing hashmap from java.util
import java.util.HashMap;
//importimg scanner from java.util
import java.util.Scanner;

public class Fees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating a hashmap
		HashMap<String, Info> fees = new HashMap<>();

		// decalring a variable
		String id;

		// creating scanner object
		Scanner sc = new Scanner(System.in);

		// creating Information Object
		Info infor = new Info();

		// adding some data
		fees.put("101", new Info(101, "Disha", "IT", 80000));
		fees.put("102", new Info(102, "Shree", "CA", 50000));
		fees.put("103", new Info(103, "Shreena", "DOCTOR", 60000));

		// printing
		System.out.println("Enter The Student Id:");
		id = sc.next();

		// to check if present or not
		boolean student = fees.containsKey(id);

		// TO DISLAY INFO
		if (student) {
			infor = fees.get(id);
			System.out.println(infor);

		}

		else {
			System.out.println(" INVALID ID ");
		}

		sc.close();

	}

}
