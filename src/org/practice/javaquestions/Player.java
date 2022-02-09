package org.practice.javaquestions;

public class Player 
{
	
	private String name;
	
	private int runs;
	
	private float avg;

	public Player(String name, int runs, float avg) 
	{
		this.name = name;
		this.runs = runs;
		this.avg = avg;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getRuns()
	{
		return runs;
	}

	public void setRuns(int runs) 
	{
		this.runs = runs;
	}

	public float getAvg() 
	{
		return avg;
	}

	public void setAvg(float avg) 
	{
		this.avg = avg;
	}

	@Override
	public String toString() 
	{
		return "Player [name=" + name + ", runs=" + runs + ", avg=" + avg + "]";
	}
	
	
	
	
	

}
