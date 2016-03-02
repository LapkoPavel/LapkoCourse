package com.springinaction.springidol;

public class Sonnet29 implements Poem
{
	private static String[] LINES =
		{
				"One",
				"Two",
				"Three",
				"Four",
				"Five",
				"Six",
				"Seven"
		};
	
	public Sonnet29()
	{
		
	}
	
	public void recite()
	{
		for(int i=0; i<LINES.length; i++)
		{
			System.out.println(LINES[i]);
		}
	}
}
