package com.ShoppingDaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Shopping.Shopping;
import com.ShoppingDao.ShoppingDao;

public class ShoppingDaoImpl implements ShoppingDao {
	List<Shopping> sList = new ArrayList<Shopping>();

	// creating Scanner Object
	Scanner sc = new Scanner(System.in);

	// To Add item
	public void additem1() {

		// creating object
		Shopping ss = new Shopping();

		// input the details
		System.out.println("Enter id:");
		ss.setId(sc.nextInt());

		System.out.println("Enter item :");
		ss.setItemname(sc.next());

		System.out.println("Enter brand :");
		ss.setBrand(sc.next());

		System.out.println("Enter quantity :");
		ss.setQuantity(sc.nextInt());

		System.out.println("Enter Price per unit:");
		ss.setPrice(sc.nextInt());

		// adding the items into the collection
		sList.add(ss);
		System.out.println(sList);

	}

	// to delete item
	public boolean deleteitem1(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		Shopping sdel = null;
		// finding item
		for (Shopping s : sList) {
			if (s.getId() == id)
				sdel = s;
		}
		// check whether the record is present
		if (sdel == null)
			status = false;
		else {
			sList.remove(sdel);
			status = true;
		}

		return status;
	}

	// to search
	public Shopping searchItem(int id) {

		Shopping sfind = null;

		// finding the item
		for (Shopping s : sList) {
			if (s.getId() == id)
				sfind = s;
		}

		return sfind;
	}

	// To display details
	public void displayAll() {

		for (Shopping s : sList) {
			System.out.println(s);
		}

	}

	public void additem() {
		// TODO Auto-generated method stub

	}

	public boolean deleteitem(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
