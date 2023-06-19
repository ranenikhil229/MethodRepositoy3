package com.Constructor;

public class Order {

		String order_city;

		public Order() {
			this(101,"PenDrive");
			System.out.println("This is my order");
		}

		public Order(String ordercity) {
			this();
			this.order_city = ordercity;

		}
		public Order(int order_id,String Product_name)
		{
			System.out.println(order_id+" "+Product_name);
		}

		public void display() {

			System.out.println(order_city);
		}

		
		
		public static void main(String[] args) {

			Order o2 = new Order("pune");
			o2.display();

		

	}

}
