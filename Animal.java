package com.fdmgroup.zooDesignProject;

public abstract class Animal {
	
	private final long ANIMAL_ID;
	
	private static long nextAnimalId = 300;
	
	private String name;
	
	private boolean feed = false;

	public Animal(String name) {		
		super();
		this.name = name;
		this.ANIMAL_ID = nextAnimalId;
		nextAnimalId += 15;
	}
	
	public boolean eat(Food food) {
		this.feed = true;		
		return feed;
	}

	public String getName() {
		return name;
	}

	public boolean getFeed() {
		return feed;
	}


	public long getANIMAL_ID() {
		return ANIMAL_ID;
	};
	
	
	
	

}
