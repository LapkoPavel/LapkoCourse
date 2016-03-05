package com.springinaction.springidol;

import org.springframework.stereotype.Component;

import com.springinaction.springidol.qualifiers.StringedInstrument;


public class Saxophone implements Instrument
{
	public Saxophone()
	{
		
	}
	
	public void play()
	{
		System.out.println("TOOT TOOT TOOT");
	}
}
