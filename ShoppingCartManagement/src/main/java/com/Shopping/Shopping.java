package com.Shopping;

//declaring class
public class Shopping {

	// instance variable
	private int id;
	private String Itemname;
	private String Brand;
	private int Quantity;
	private int Price;

	//// default constructors
	public Shopping() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructors
	public Shopping(int id, String itemname, String brand, int quantity, int price) {
		super();
		this.id = id;
		Itemname = itemname;
		Brand = brand;
		Quantity = quantity;
		Price = price;
	}

	// getters setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemname() {
		return Itemname;
	}

	public void setItemname(String itemname) {
		Itemname = itemname;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	// to string
	@Override
	public String toString() {
		return "Shopping [id=" + id + ", Itemname=" + Itemname + ", Brand=" + Brand + ", Quantity=" + Quantity
				+ ", Price=" + Price + "]";
	}

}
