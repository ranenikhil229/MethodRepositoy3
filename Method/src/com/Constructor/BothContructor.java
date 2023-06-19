package com.Constructor;

public class BothContructor {
	
	public BothContructor() {
		
		System.out.println("int parameterless contructor");
	}
	
	public BothContructor(int id, String name, int age)
	{
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args) {

		BothContructor b = new BothContructor();
		BothContructor b2 = new BothContructor(101, "aniket", 23);

	}

}
