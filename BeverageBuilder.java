package com.secondjavaprogram;

public abstract class BeverageBuilder 
{
	private Beverage beverage;
	
	public Beverage getBeverage()
	{
		return beverage;
	}
	public void  setBeverage(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	
	public final Beverage buildBeverge(Beverage bevergae)
	{
		Beverage beverage = getBeverage();
		setBeverage(bevergae);
		setBeverageType();
		setWater();
		setMilk();
		setSugar();
		setpowderquantity();
		return beverage;
		
	}
	
	
	abstract void setBeverageType();
    abstract void setpowderquantity();
	void setSugar() {
	}	abstract void setWater();
	public abstract void setMilk();
	protected abstract Beverage buildBeverage();
	protected abstract Beverage getBeverage1();
	
}
		
		
	