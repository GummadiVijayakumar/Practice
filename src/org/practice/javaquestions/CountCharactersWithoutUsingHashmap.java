package org.practice.javaquestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CountCharactersWithoutUsingHashmap 
{
	public static void main(String[] args) 
	{
		
		
		String Str = "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqgugugugugugugugguguguguggu";
		
		System.out.println("String size : "+Str.length());
		
		char[] charArr  = Str.toCharArray();
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(char c : charArr)
		{
			set.add(c);
		}
		
		System.out.println("Hashset size : "+set.size());
		
		Iterator<Character> itr = set.iterator();
		
		ArrayList<String> rest = new ArrayList<String>();
		
		while(itr.hasNext())
		{
			int loop = 0;
			
			char g = itr.next();
			
			for(int i =0; i< charArr.length ; i++)
			{
				
				if(  g  == charArr[i])
				{
					loop++;
				}
			}
			
			String tr = g +"-->"+ loop+ "";
			rest.add(tr);
			
			loop=0;
			tr= "";
		}
		
		System.out.println(rest);
		
	}
}
