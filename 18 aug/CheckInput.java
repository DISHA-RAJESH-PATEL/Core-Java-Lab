/*Lab session
@program: Java program to check the input is vowel,consonents,number or special character and print its ascii value.
@author:Disha Patel
@date:-18august
*/
class CheckInput
{
	//creating static method 
static void asciiValue()
{
	//using if else nested loop
	if
	{ 
	char c1='a,e,i,o,u';	//creating characterfor vowels
		System.out.println("The entered character is vowel");
	} 
	else if
	{
		char c2=('c2=a-z',c2!=c1);  //creating character ranging from atoz where c2 is not equal to c1(vowels)
		System.out.println("The entered character is consonents");
	}
	else if
	{	//creating int num1 where i is ranging from 0 to 9
		int num1;
		num1=(i=0;i<=9;i++); 
		System.out.println("The entered character is number");
	}
	else
		{
			System.out.println("The number is a special character");
			
		}
}
	
		
public static void main(String args[])
{
	System.out.println("The Entered Value is:" +args[0]); //for input command
	System.out.println("The Ascii value of Entered Value is:" +asciiValue()); //to print ascii value
}
}