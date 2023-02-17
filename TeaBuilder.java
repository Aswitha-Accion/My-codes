package com.secondjavaprogram;

public abstract class TeaBuilder extends BeverageBuilder
{
	Beverage createBeverage()
	{
		return new Beverage();
	}
	public void setWater1()
	{
		System.out.println("step 1: boil water");
		getBeverage().setWater(20);
	}
	public void setMilk()
	{
		System.out.println("step 2:add milk");
		getBeverage().setWater(30);
	}
	public void setSugar1()
	{
		System.out.println("step 3: add sugar");
		getBeverage().setWater(30);
	}
	public void setpowderquantity1()
	{
		System.out.println("step 4: add 10 grams of powder");
		getBeverage().setWater(10);
	}
	public void setbeveragename1()
	{
		System.out.println("step 1: tea");
		getBeverage().setWater(20);
	}
}

	