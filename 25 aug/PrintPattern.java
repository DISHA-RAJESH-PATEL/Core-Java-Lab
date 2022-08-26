/*
	Lab Test
	Program: Program to print the following pattern
		 1
		 1 2
		 1 2 3
		 1 2 3 4
		 1 2 3 4 5	
	@author: Disha Patel
	@Date  : 25 Aug 2022 
*/


class PrintPattern
{
   static void printNums()
     {
       int i, j,num;
	   // printing number vertically
       for(i=0; i<5; i++) 
       {
        num=1;
		// printing number horizontaly
        for(j=0; j<=i; j++)  
        {
         // printing num 
         System.out.print(num+ " ");
         num++;
        }

        // ending line
         System.out.println();
       }
     
	 }
	 
	 
     //calling the main method 
     public static void main(String...args)
         {
			// calling printing number 
            printNums();
         }

}