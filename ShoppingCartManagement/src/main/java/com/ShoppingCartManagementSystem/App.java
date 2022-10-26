package com.ShoppingCartManagementSystem;

import java.util.Scanner;

import com.ShoppingDao.ShoppingDao;
import com.ShoppingDaoImpl.ShoppingDaoImpl;

public class App {

	public static void menu() {
		System.out.println("");
		System.out.println("MENU:");
		System.out.println("1. Add item");
		System.out.println("2. Delete item");
		System.out.println("3.Display all the items");
		System.out.println("4.Exit");
		System.out.println("");
	}

	public static void main(String[] args) {

		// creating Scanner Object
		Scanner sc1 = new Scanner(System.in);
		// creating object of impl
		ShoppingDao shop = new ShoppingDaoImpl();

		try {
			int ch = 0;
			do {
				menu();
				ch = sc1.nextInt();
				Object ee;
				switch (ch) {
				case 1:
					shop.additem1();
					System.out.println("");
					System.out.println("item data added successfully ");
					break;
				case 2:
					System.out.println("Enter the Id you want to  deleted:");
					int id = sc1.nextInt();
					boolean flag = shop.deleteitem1(id);
					if (flag)
						System.out.println("item deleted successfully");
					else
						System.out.println("Cannot find item in the data");
					break;

				case 3:
					shop.displayAll();
					break;

				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid input.Try Again");

				}

			} while (ch != 4);

			// end of do while

			sc1.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
