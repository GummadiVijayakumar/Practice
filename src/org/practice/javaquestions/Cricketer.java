package org.practice.javaquestions;

public class Cricketer implements Comparable<Object>
{
	
	private String name;
	
	private int runs;
	
	
	private float avg;


	@Override
	public String toString() 
	{
		return "Cricketer [name=" + name + ", runs=" + runs + ", avg=" + avg + "]";
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


	public Cricketer(String name, int runs, float avg)
	{
		this.name = name;
		this.runs = runs;
		this.avg = avg;
	}


	@Override
	public int compareTo(Object y) 
	{
		if(this.runs > ((Cricketer)(y)).runs)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
		
	}
	
	

}
