/*
LAB TEST
@PROGRAM:-(1) Write a code to check a string is palindrome or not	
@AUTHOR:-DISHA PATEL
@DATE:- 6 OCTOBER
*/

//IMPORTING SCANNER PACKAGE
import java.util.Scanner;

//CREATING PUNBLIC CLASS NAMED Palindrome
public class Palindrome
 {
	//CREATING STATIC METHOD OF BOOLEAN TYPE NAMED checkPalindrome
	static boolean checkPalindrome(String str)
	{

		boolean status;
		//TO EXTRACT STRING INTO ARRAY
		char ch[] = str.toCharArray();

		//CREATING EMPTY STRING
		String revstrString = "";
		
		//USING FOR LOOP
		for (int i = ch.length - 1; i >= 0; i--) {
			revstrString += ch[i];
		}

		int flag = str.compareTo(revstrString);
		//USING IF ELSE LOOP TO CHECK STATUS
		if (flag == 0)
			status = true;
		else
			status = false;

		return status;
	}//END OF checkPalindrome METHOD

	
	//CALLING MAIN METHOD
	public static void main(String[] args)
	{
		//CREATING SCANNER CLASS FOR INPUT
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter a String:");
		String disha = sc.next();
		
		//TO CHECK WHETER THE GIVEN STRING IS  BOOLEAN  OR NOT
		boolean check = checkPalindrome(disha); //CALLING checkPalindrome METHOD
		
		//PRINTING  WHETHER ENTERED STRING IS PALINDROME OR NOT USING IF ELSE LOOP 
		if (check)
			{
			System.out.println("THE  ENTERED STRING IS PALINDROME");

		}
		else
			System.out.println("THE ENTERED STRING IS NOT PALINDROME");
		sc.close(); //CLOSING SCANNERCLASS
	}///END OF MAIN METHOD

}//END OF CLASS Palindrome