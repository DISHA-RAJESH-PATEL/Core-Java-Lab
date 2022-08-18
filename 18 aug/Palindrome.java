/*Lab Session
@program: Write a program to check the number is palindrom or not
@author:Disha Patel
@date:-18august
*/
class Palindrome
{
	//creating static method
	static void myPalindrome(int p)
	{
	//int num=5643465 ; //creating integer num and giving it value
	int d,num =0; //creating int d and num2 and assigning
	
	int temp = p; 
	while(p>0) //using while loop
	{
	 d = p%10;
	 num =(num*10)+d;
	 p = p/10;
	 if(num==temp)  //using if else loop
       System.out.println("number" + temp + " is a palindrome");
     else
		System.out.println("number"+ temp + " is not palindrome"); 

	 }
	}	 
	//calling main method
	public static void main(String arg[])
	 {
	 int num1=Integer.parseInt(arg[0]);
	 PalindromeNum(num1);
		 myPalindrome();
		 //System.out.println(args[]);  //for input command
		 //System.out.println("The number is:" +myPalindrome()); //to print whether the number input is palindrome or not
		 
		//myPalindrome();
	 }
	 
	 
}