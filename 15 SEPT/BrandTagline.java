/*
Lab session
@program: Write a java program to print the tagline of any 5 companies(Enhanced Switch Case)
@author:Disha Patel
@date:-15 september 2022
*/


import java.util.Scanner;  //importing scanner class

//creating class BrandTagline
class BrandTagline
{
	
	static String brand;
	
	 //creating static method takeInput()
	static void takeInput()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Brand Name: ");
		brand= sc.next(); // string input
	}  //ending static method takeInput()
	
	
	//creating static method printTagline()
	static void printTagline()
	{
		
		switch (brand)     //using switch case
		{
			//using different cases in switch case
			case "nike" ://"nike"; 
				System.out.println("just do it");	
			break;
			case "apple"://"apple;
				System.out.println("think different");
			break;
			case "loreal"://Loreal;
				System.out.println("because you are worth it");
			break;
			case "cocacola": //Cocacola;
				System.out.println("open happiness");
			break;
			case "mcdonalds":  //McDonalds;
			System.out.println("I'm  loving it");
			break;
			
			default: System.out.println("ERROR!!!  Only valid for - nike,apple,Loreal,cocacola and McDonalds. PLEASE TRY AGAIN");
		}  //ending switch case
		
	}	//ending  static method  printTagline()
	
	
	static void display()
	{
		 System.out.println("    ");
		System.out.println("BRAND ENTERED IS: "+ brand);  //to print the brand entered
		System.out.println("  ");
		System.out.print("TAGLINE  OF  " +brand+" IS :-  ");
       	
	} 	//ending  static method display()
	
	//calling main method
	public static void main(String args[])
	{
		takeInput();		//calling static method takeInput()
		display();		 	//calling static method display()
		printTagline(); 	//calling static mehtod printTagline()
	
  	}  	//ending  main method
} 	//ending class  BrandTagline--