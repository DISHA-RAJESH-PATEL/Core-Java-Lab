/*
LAB TEST
@program:-(Q2)WRITE A PROGRAM THAT READS A SET OF INTEGERS AND THEN PRINTS THE SUM OF THE  EVEN AND ODD INTEGERS
				(USING ARRAYS)
@author:-  DISHA PATEL.
@Date:- 1 september 2022.
*/


import java.util.Scanner;
 class EvenOddSum
 {
	private static Scanner sc;
	public static void main(String ...args) 
	{
		int Size, i, EvenSum = 0, OddSum = 0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");

		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 == 0)  //NUMBER DIVIDE BY 2 AND IF REMAINDER IS ZERO
			{
				EvenSum = EvenSum + a[i];   //IT IS EVEN
			}
			else
			{
				OddSum = OddSum + a[i]; //OR IT IS ODD
			}
		}		
		System.out.println(" The Sum of Even Numbers  = " + EvenSum);
		System.out.println(" The Sum of Odd Numbers  = " + OddSum);
	}
}