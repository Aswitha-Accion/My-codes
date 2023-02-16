package com.secondjavaprogram;

public class Client {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		Animal animal = null;
		AnimalFactory animalFactory = null;
		Object speakSound = null;
		
		animalFactory = AnimalFactory.getAnimalFactory("sea");
		System.out.println("Animal factory type :" + animalFactory.getClass().getName());
		System.out.println();
		
		animalFactory = AnimalFactory.getAnimalFactory("land");
		System.out.println("Animal factory type :" + animalFactory.getClass().getName());
		System.out.println();
		
		
		animal = animalFactory.getAnimal("shark");
		System.out.println("Animal Type:" +animal.getClass().getName());
		speakSound = Animal.Speak();
		System.out.println("shark speak:" + speakSound());
		System.out.println();
		
		animal = animalFactory.getAnimal("octopus");
		System.out.println("Animal Type:" +animal.getClass().getName());
		speakSound = Animal.Speak();
		System.out.println("octopus speak:" + speakSound());
		System.out.println();
		
		
		animal = animalFactory.getAnimal("dog");
		System.out.println("Animal Type:" +animal.getClass().getName());
		speakSound = Animal.Speak();
		System.out.println("dog speak:" + speakSound());
		System.out.println();
		
		
		animal = animalFactory.getAnimal("cat");
		System.out.println("Animal Type:" +animal.getClass().getName());
		speakSound = Animal.Speak();
		System.out.println("cat speak:" + speakSound());
		System.out.println();
		
		
		animal = animalFactory.getAnimal("lion");
		System.out.println("Animal Type:" +animal.getClass().getName());
		speakSound =  Animal.Speak();
		System.out.println("lion speak:" + speakSound());
		System.out.println();
	}

	private static String speakSound() {
		return speakSound();
		// TODO Auto-generated method stub
		}
}
