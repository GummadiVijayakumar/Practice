package org.practice.javaquestions;

import java.util.ArrayList;
import java.util.Collections;

public class RunforComparator 
{
	public static void main(String[] args)
	{	
		
		
		
		Player p1 = new Player("Sahara", 568, 90.78f);
		
		Player p2 = new Player("euhfiuwergfv", 562, 98.78f);
		
		Player p3 = new Player("India", 693, 69.35f);
		
		
		ArrayList<Player> al =  new ArrayList<Player>();
		
		al.add(p3);
		al.add(p2);
		al.add(p1);
		
		System.out.println(al);
		
		QCompare q = new QCompare();
		
		Collections.sort(al, q);
		
		System.out.println(al);
		
		
		
		
	}
}
