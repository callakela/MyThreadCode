package com;
class A
{
	int i = 50;

	public A(int i)
	{
		this.i = i;
	}

	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("From Finalize Method, i = "+i);
	}
}