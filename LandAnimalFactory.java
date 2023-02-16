package com.secondjavaprogram;

public class LandAnimalFactory extends AnimalFactory
{
	public Animal getAnimal(String animalType)
	{
		Animal animal = null;
		if("cat".equals(animalType))
		{
			animal = new Cat();
		}
		else if("dog".equals(animalType))
		{
			animal = new Dog();
		}
		if("lion".equals(animalType))
		{
			animal = new Lion();
		}
		return animal;
		
	}
	
}