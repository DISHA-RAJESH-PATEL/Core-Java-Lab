/*
LAB TEST
@program:- WRITE A JAVA  PROGRAM TO CALCULATE SIMPLE INTEREST (SI=P*R*T) WHERE T=5 (TAKE P AND R FROM USER)
@author:-DISHA  PATEL
@date:-8 SEPTEMBER 2022
*/
//simple interest= principle*rate of interest*time


//DECLARING A CLASS
class SimpleInterest
{
	//CALLING MAIN METHOD
	public static void main(String ...args)
	{
		
		double principle=Double.parseDouble(args[0]); //DECLARING Double principle AND GIVING IT  A COMMAND LINE ARGUMENT FOR USER INPUT
		double rate =Double.parseDouble(args[1]); //DECLARING Double rate AND GIVING IT  A COMMAND LINE ARGUMENT FOR USER INPUT
		double  time=5;  //time given 5 
		int interest=(int)(principle*rate*time)/100; //(SI=P*R*T)/100 since rate of interest is in percent 
		
		
	System.out.println("SIMPLE INTEREST IS : "+interest +" RS."); //PRINTING SIMPLE INTEREST
	
	} //END OF MAIN METHOD
}  //END OF CLASS SimpleInterest

/* 
OUTPUT 
input:- 10 3
SIMPLE INTEREST IS : 1 


input:- 10000 5
SIMPLE INTEREST IS : 2500 */