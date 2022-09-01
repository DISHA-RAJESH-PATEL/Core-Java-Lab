/*
LAB TEST
@program:-WRITE A PROGRAM TO CREATE A ROOM CLASS, THE ATTRIBUTES OF THIS CLASS IS ROOM NUMBER,ROOM TYPE,ROOM AREA,AND AC MACHINE.
			IN THIS CLASS THE MEMBER FUNCTIONSS ARE SETDATAAND DISPLAY DATA.
@author:-  DISHA PATEL.
@Date:- 1 september 2022.
*/
import static java.lang.System.*;  //importing System package from java.lang class
class Room    					   //Declaring class Room
{   
	//declaring variable as private
	private int roomNo;
	private String roomType;
	private float roomArea;
	private boolean acMachine;
	
	
	//creating void method 
	void roomData(int r_no,String r_type,float r_area,boolean ac)
	{
		//assigning variables methods function
		roomNo=r_no;
		roomType=r_type;
		roomArea=r_area;
		acMachine=ac;
	}//roomData method ends here
	
	//crating void method for displaying/printing room details
	void printRoom()
	{
		//printing room details
		out.println("");
		out.println("THE ROOM NUMBER IS:" +roomNo);
		out.println("THE ROOM TYPE IS:" +roomType);
		out.println("THE ROOM AREA IS:" +roomArea);
		out.println("AC MACHINE AVAIBILITY:" +acMachine);
		out.println("");
	
	}//printRoom method ends here
	
	//calling  main method
	public static void main(String ...args)
	{
		//crating objects r1 and r2
		Room r1=new Room();
		Room r2=new Room();
		//calling roomeData method and ntering details for r1 and r2:-(room no,room type,area,as availability)
		r1.roomData(801,"delux",500.6f,true);
		r2.roomData(201,"regular",150.8f,false);
		//calling printRoom method for r1 and r2 objects to print room details
		r1.printRoom();
		r2.printRoom();
	}//ending main method
	
}//ending class Room