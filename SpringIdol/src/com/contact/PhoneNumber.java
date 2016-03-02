package com.contact;

public class PhoneNumber 
{
	private String areaCode;
	private String prefix;
	public String number;
	
	public PhoneNumber(){}
	
	public PhoneNumber(String areaCode, String prefix, String number)
	{
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.number = number;
	}
	
	public String getNumber()
	{
		return "Number is"+areaCode+prefix+number;
	}
}
