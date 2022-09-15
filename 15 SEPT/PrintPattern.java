/*
LAB TEST
@program:- JAVA PROGRAM TO PRINT A PATTERN
							*
						   * *
						  * * *
						 * * * * 
@AUTHOR:-DISHA PATEL
@DATE:-15 SEPTEMBER 2022
*/
	

class PrintPattern
{
	//creating static method called trianglePattern
	static void trianglePattern(int rows)
	{
		for(int i=1;i<=rows;i++) // outer loop for my rows
		{
			System.out.println(); //to  print every row in a new line
			
			for(int spaces=rows;spaces>i;spaces--)  //for spaces
			{
				System.out.print(" ");  //to pring space
			}
			
			for(int j=1;j<=i;j++)   //inner loop for columns
			{
				System.out.print("* ");   //printing star with space
			}  //ending inner for loop for columns
			
			
		}    //ending outer for loop for rows
		
		
	}  //ending static  method called trianglePattern
	
		//calling main method
   public static void main(String... args)
   {
	  int number =Integer.parseInt(args[0]);  //Parsing string into integer since command line argument is string
	  trianglePattern(number);   //calling trianglePattern method
      
   }     //ending main method


}   //ending class PrintPattern