/*Lab session
@program:Java programto print the tagline of the brand entered(take any 5 brands)
@author:Disha Patel
@date:-18august
*/

class BrandTagline
{
	//creating static method
	static void printTagline()
	{
		int brand=5;
		Switch(Tagline) ; //using switch case
		{
			//using different cases in switch case
			case 1: //nike;   
		
				System.out.println("just do it");	
			break;
			case 2://apple;
				System.out.println("think different");
			break;
			case 3://Loreal;
				System.out.println("because you are worth it");
			break;
			case 4://Cocacola;
				System.out.println("open happiness");
			break;
			case 5://McDonalds;
			System.out.println("I'm  loving it");
			break;
			//default value if conditions are not met
		default: System.out.println("only valid for - nike,apple,Loreal,cocacola and McDonalds");
		}
	}
	
public static void main(String args[])
{
	//for input of brand name and then printing it's tagline
	//System.output.println("the tagline of:"  +args[0] +"is" +printTagline()); 
	printtagline(); //calling static mehtod
}
}