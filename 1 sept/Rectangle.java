/*
LAB TEST
@program:-(Q3)Create a class named 'Rectangle' with two data members- length and breadth and a function to calculate the area which is 'length*breadth'.
				The class has three constructors which are :
				1 - having no parameter - values of both length and breadth are assigned zero.		
				2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.		
				3 - having one number as parameter - both length and breadth are assigned that number.		
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
@author:-  DISHA PATEL.
@Date:- 1 september 2022.
*/

import java.util.Scanner.*;
import static java.lang.System.*;

class Rectangle
{
	private int a;
	private int b;
	
	 void Area()
	{
		sc = new Scanner(System.in);
	 
		out.print("enter length and breadth: ");
		Size = sc.nextInt();	
		out.print("Area:"+a*b+"sq cm");
	}
}
class Test
{
	Test()
	{
		a=0;
		b=0;
	}
	
	void Test(int x,int y)
	{
		this.a=y;
		this.b=y;
	}
	void Test(int x)
	{
		this.a=x;
		this.b=x;
	}
	public static void main(String ...args)
	{
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		t1.area();
		t2(6,7);
		t3(7);
	}
}