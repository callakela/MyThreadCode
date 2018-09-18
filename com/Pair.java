package com;

public class Pair {
	
    private int numberOne;
	
	private int numberTwo;
	
	public Pair(int numberOne,int numberTwo) {
		
		this.numberOne=numberOne;
		this.numberTwo=numberTwo;
	}
		
	
	public int getNumberOne() {
		return numberOne;
	}

	
	public int getNumberTwo() {
		return numberTwo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOne;
		result = prime * result + numberTwo;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (numberOne != other.numberOne)
			return false;
		if (numberTwo != other.numberTwo)
			return false;
		return true;
	}

	
	
	


}
