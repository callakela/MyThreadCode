package com;
class C extends B
{
	{
		System.out.println(3);
	}
	
	String s = "Class C";

	{
		System.out.println(super.s);
	}
	
	static
	{
		System.out.println("FIRST");
	}
}