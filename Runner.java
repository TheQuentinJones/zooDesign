package com.fdmgroup.zooDesignProject;

public class Runner {

	public static void main(String[] args) {
		
		Customer luis = new Customer("Luis", 28);
		
		System.out.println(luis.getCUSTOMER_ID());
		
		System.out.println(luis.getAge());
		System.out.println(luis.getName());
		
		Customer christopher = new Customer("Christopher", 25);
		
		System.out.println(christopher.getCUSTOMER_ID());

	}

}
