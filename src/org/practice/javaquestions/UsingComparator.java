package org.practice.javaquestions;

import java.util.ArrayList;
import java.util.Collections;

public class UsingComparator 
{
	public static void main(String[] args) 
	{	
		
		Cricketer c1 = new Cricketer("Shrey", 678, 90.78f);
		
		Cricketer c2 = new Cricketer("Sourav", 568, 92.78f);
		
		Cricketer c3 = new Cricketer("karthik", 589, 69.78f);
		
		
		ArrayList<Cricketer> al = new ArrayList<Cricketer>();
		
		
		al.add(c1);
		
		al.add(c2);
		
		al.add(c3);
		
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		

	}
}
