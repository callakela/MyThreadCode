package com;
public class B extends A1
{
	int i = 20;
	{
		System.out.println(2);
	}
	
	String s = "Class B";

	{
		System.out.println(super.s);
	}
	
	static
	{
		System.out.println("SECOND");
	}
}