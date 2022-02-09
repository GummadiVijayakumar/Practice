package org.practice.javaquestions;

import java.util.Comparator;

public class QCompare implements Comparator {

	@Override
	public int compare(Object P1, Object P2) 
	{
		
		if(((Player)(P1)).getRuns()  > ((Player)(P2)).getRuns())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
