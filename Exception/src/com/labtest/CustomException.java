package com.labtest;

import java.util.Scanner;

public class CustomException {
	private int id;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in); 
			System.out.print("ENTER YOUR STUDENT ID: ");
			int id=sc.nextInt();
			sc.close();
		try
		{
			if(id<=0);
			throw new Exception();	
		}
		 catch (Exception e)
			{
			System.out.println("EXCEPTION CAUGHT");
			 
			}
	}

}
