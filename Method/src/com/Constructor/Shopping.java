package com.Constructor;

public class Shopping {
	
	int productid;
	String productName;
	int quantity;
	int price;
	float bill;
	
	public  Shopping(int productid, String productName, int quantity,int price) {
		this.productid=productid;
		this.productName=productName;
		this.quantity = quantity;
		this.price=price;
		
	}
	
	public void calculateBill() {
		
		if(quantity>0)
		{
			bill=price*quantity;
			this.displayAllProductDetails();
		}
		else
		{
			System.out.println("quantity is less than 0");
		}
		
	}

	public void displayAllProductDetails() {
		
		System.out.println(productid+" "+productName+" "+quantity+" "+price+" "+bill);
	
}

	public static void main(String[] args) {

	Shopping s = new Shopping(101,"suraj", 0,20000);
	s.calculateBill();
	
		

	}

}
