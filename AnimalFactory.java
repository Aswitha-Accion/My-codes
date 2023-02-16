package com.secondjavaprogram;

public abstract class AnimalFactory 
{
	public abstract Animal getAnimal(String animalType);
	
	public static SeaAnimalFactory getAnimalFactory(String factoryType)
	{
		SeaAnimalFactory animalFactory = null;
		LandAnimalFactory animalFactory1 = null;
		if("sea" .equals(factoryType))
		{
			animalFactory  = new SeaAnimalFactory();
		}
		else
		{
			animalFactory1  = new LandAnimalFactory();
		}
		return animalFactory;
	}

}
