package com.fdmgroup.zooDesignProject;

public class Customer extends Person {
	
	private final long CUSTOMER_ID;
	
	private static long nextCustomerId = 4000;
	
	public Customer(String name, int age) {		
		super(name, age);
		this.CUSTOMER_ID = nextCustomerId;
		nextCustomerId += 1;
	}
	
//	public double calculateAdmissionCost() {
//		double admissionCost = 0;
//		if ( super.getAge() < 6) {
//			return admissionCost;
//		} else if ( super.getAge() <= 12 )
//			admissionCost = 10;
//	}
	
	public void seeNextAnimal() {
		
		
		
	}
	

	public long getNextCustomerId() {
		return nextCustomerId;
	}

	public long getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}	
	
	

}
