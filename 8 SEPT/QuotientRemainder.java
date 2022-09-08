/*
LAB TEST
@program:- JAVA PROGRAM TO FIND QUOTIENT AND REMAINDER(TAKE INPUT FROM USER)
@author:-DISHA  PATEL
@date:-8 SEPTEMBER 2022
*/


		//quotient=dividend/divisor
		//remainder=dividend%divisor
		

//DECLARING A CLASS
class QuotientRemainder
{
	//CALLING MAIN METHOD
	public static void main(String ...args)
	{
		float dividend=Float.parseFloat(args[0]); //DECLARING FLOAT DIVIDENT AND GIVING IT  A COMMAND LINE ARGUMENT FOR USER INPUT
		float divisor=Float.parseFloat(args[1]); //DECLARING FLOAT DIVISOR AND GIVING IT  A COMMAND LINE ARGUMENT FOR USER INPUT
		float  quotient=dividend/divisor;  //quotient=dividend/divisor
		int remainder=(int)(dividend%divisor); //remainder=dividend%divisor
		
		
	System.out.println("QUOTIENT IS : "+quotient); //PRINTING QUOTIENT
	System.out.println("REAMIANDER IS : "+remainder); //PRINTING REAMIANDER
	} //END OF MAIN METHOD
}  //END OF CLASS QuotientRemainder
