package com.springinaction.springidol;

public class Magican implements Performer
{
	public void perform() throws Exception
	{
		System.out.println(magicWords);
		System.out.println("The magic box contains...");
		System.out.println(magicBox.getContents());
	}
	
	private MagicBox magicBox;
	public void setMagicBox(MagicBox magicBox)
	{
		this.magicBox=magicBox;
	}
	
	private String magicWords;
	
	public void setMagicWords(String magicWords)
	{
		this.magicWords = magicWords;
	}
}
