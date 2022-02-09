package org.practice.javaquestions;

import java.util.ArrayList;
import java.util.List;

public class SortingWithLambdaExpression 
{
	public static void main(String[] args) 
	{	
		
		
		List<Player> playerList = new ArrayList<Player>();
		
		playerList.add(new Player("Shrey", 22, 89.56f));
		playerList.add(new Player("sagar", 24, 78.56f));
		playerList.add(new Player("sulochana", 88, 87.56f));
		playerList.add(new Player("gummadi", 78, 96.56f));
		playerList.add(new Player("sourav", 96, 89.56f));
		playerList.add(new Player("karthik", 56, 649.56f));
		playerList.add(new Player("Ashihs", 64, 68.56f));
		
		System.out.println("Before sorting the player list is :");
		playerList.forEach((p) -> System.out.println(p));
		
		
		System.out.println("After sorting the player list by Average :");
		playerList.sort((Player p1 , Player p2)->p1.getRuns()-p2.getRuns());
		
		
		playerList.forEach((p) -> System.out.println(p));
		
	}
}
