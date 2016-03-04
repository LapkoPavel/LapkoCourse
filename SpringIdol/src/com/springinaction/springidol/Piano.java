package com.springinaction.springidol;

import javax.inject.Named;

import com.springinaction.springidol.qualifiers.StringedInstrument;



public class Piano implements Instrument 
{
	public Piano(){}
	
	public void play()
	{
		System.out.println("PLINK PLINK PLINK");
	}

}
