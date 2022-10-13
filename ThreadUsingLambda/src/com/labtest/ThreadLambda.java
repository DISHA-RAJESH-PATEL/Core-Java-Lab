package com.labtest;

public class ThreadLambda {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//(ANONYMOUS CLASS)THREADS

		
				// CLASS OBJECT=NEW CLASS(){ } ;    (DECLARATION OF ANONYMOUS CLASS)
				Runnable r1 = new Runnable() {

					
					//OVERRIDING RUN METHOD
					@Override
					public void run() 
					{
						//PRINTING 
						System.out.println(Thread.currentThread().getName() + " <-THIS THREAD IS RUNNING WITH ANONYMOUS CLASS.");

					} //END OF RUN METHOD

				}; //ANONNYMOUS CLASS ENDS WITH };
				
				Thread thread1 = new Thread(r1, "DISHA"); //CREATING THREAD
				thread1.start();  //TO START EXECUTION OF THREAD THREAD1
				
				
				
				
				//THREADS WITH LAMBDA
				//SYNTAX FOR LAMBDA ()->{};
				Runnable r2 = () -> {System.out.println(Thread.currentThread().getName() + "<-THIS THREAD IS RUNNING WITH LAMBDA");};

				Thread thread2 = new Thread(r2, "PATEL");
				thread2.start();  //TO START THE EXECUTION OF THREAD2
	} //END OF MAIN METHOD
} //END OF CLASS


	
