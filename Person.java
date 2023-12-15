package com.fdmgroup.zooDesignProject;

import java.util.List;

public abstract class Person {
	
	private String name;
	
	private int age;
	
	private List<Animal> animalsToSee;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public int countAnimalsToSee() {
		return animalsToSee.size();
	}
	
	public void removeSeenAnimal(Animal animal) {
		animalsToSee.remove(animal);
	}
	
	public void addAnimalToSee(Animal animal) {
		animalsToSee.add(animal);
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}



	public List<Animal> getAnimalsToSee() {
		return animalsToSee;
	}
	
	
	
	
}
