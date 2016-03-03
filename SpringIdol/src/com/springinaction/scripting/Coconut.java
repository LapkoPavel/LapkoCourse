package com.springinaction.scripting;

public class Coconut 
{
	public Coconut(){}
	
	public void drinkThemBothUp()
	{
		System.out.println("You put the lime in the coconut...");
		System.out.println("and drink them both up...");
		System.out.println("You put the lime in the coconut...");
		lime.drink();
	}
	
	private Lime lime;
	public void setLime(Lime lime)
	{
		this.lime = lime;
	}

}
