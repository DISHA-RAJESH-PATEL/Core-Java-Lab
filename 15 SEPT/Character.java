/*
LAB TEST
@program:- JAVA PROGRAM TO FIND WGETHER THE CHARACTER ENTERED IS VOWEL,CONSONENT, NUMBER  AND SPECIAL CHARACTER
@AUTHOR:-DISHA PATEL
@DATE:-15 SEPTEMBER 2022
*/
import java.util.Scanner;

class Character
{
		static char value;
		
		static void input()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println(" ");
			System.out.print("ENTER CHARACTER: ");
			value= sc.next().charAt(0);  // character input
			
		}
		
		
	//creating static method
	static void check()
	{
		int asciiVal= value;
		if((asciiVal>=65)&&(asciiVal<=90))
		{
	 		System.out.println("YOU ENTERED A UPPERCASR OT LOWER CASE");
			System.out.println(" ");

			if((value=='A')||(value=='E')||(value=='I')||(value=='O')||(value=='U'))
			{
				System.out.println("YOU ENTERED A VOWEL");
			}
			else
			{
				System.out.println("YOU ENTERED A CONSONANT");
			}	


		}
		else if((asciiVal>=97)&&(asciiVal<=122))
		{
			System.out.println("YOU ENTERED A LOWER CASE ALPHABET");
			System.out.println(" ");
			if((value=='a')||(value=='e')||(value=='i')||(value=='o')||(value=='u'))
			{
				System.out.println("YOU ENTERED A VOWEL");
			}
			else
			{
				System.out.println("YOU ENTERED A  CONSONENT");
			}	
		}
		else if((asciiVal>=48)&&(asciiVal<=57))
		{
			System.out.println("YOU ENTERED A  NUMBER");
		}
		else
			System.out.println(" YOU ENTERED A SPECIAL CHARACTER");
	}   //ending static method
	

	//calling  main metod
	 public static void main(String ...args)
	 {
		 input();  
		System.out.println(" ");		 
		check();
	 }		//ending main method
} //ending class Character 
	