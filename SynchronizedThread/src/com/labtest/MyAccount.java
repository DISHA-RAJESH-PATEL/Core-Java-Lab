package com.labtest;

public class MyAccount implements Runnable {
		private Account account = new Account();

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			MyAccount acc1 = new MyAccount();
			Thread thread1 = new Thread(acc1, "DISHA");
			Thread thread2 = new Thread(acc1, "SHREE");

			thread1.start();
			thread2.start();

		}

		synchronized void makeWithdrawal(int amount) {
			if (account.getBalance() >= amount) {
				System.out.println(Thread.currentThread().getName() + "  WANTS TO WITHDRAW " + amount);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				account.withdraw(amount);
				System.out.println(Thread.currentThread().getName() + " HAS WITHDRAWN AMOUNT " + amount);
			} else {
				System.out.println(Thread.currentThread().getName() + "NOT ENOUGH BALANCE TO WITHDRAW " + amount);
				System.out.println("YOUR ACCOUNT  BALANCE IS:" + account.getBalance());
			}

		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			if (account.getBalance() < 0) {
				System.out.println("AMOUNT IS OVERDRWAN");
			}
			

		}

	
}
