package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		// create a List of String obejcts
		List<String> seasonList = new ArrayList<String>();
		
		seasonList.add("Spring");
		seasonList.add("Summer");
		seasonList.add("Fall");
		seasonList.add("Winter");

		

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		// we can use List's .size() method to find out how
		// many elements it has
		for (int i = 0; i < seasonList.size(); i++) {
			System.out.println(seasonList.get(i));
		}
		
		// we can use Sytem.out to dump a list
		System.out.println("Print whole list: " + seasonList);

		

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		seasonList.add("Summer");
		
		System.out.println("seasonList after adding Summmer: " + seasonList);

		

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		


		
		// we can specify the index we want to insert at
		
		seasonList.add(1, "Tractor");
		System.out.println("seasonList after inserting after index 1: " + seasonList);

		/*
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		*/

		boolean containsTractor = seasonList.contains("Tractor");
		System.out.println("containsTractor: " + containsTractor);
		
		boolean containsUnicorn = seasonList.contains("Unicorn");
		System.out.println("containsUnicorn: " + containsUnicorn);

		
		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int tractorIndex = seasonList.indexOf("Tractor");
		System.out.println("tractorIndex: " + tractorIndex);
		
		int unicornIndex = seasonList.indexOf("Unicorn");
		System.out.println("unicornIndex: " + unicornIndex);
		

		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
	
		String removed = seasonList.remove(1);
		
		// don't need to store the removed String if we don't need it
		//seasonList.remove(1);
		
		System.out.println("Removed: " + removed);
		System.out.println(seasonList);
		
		
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		
		// must use param to indicate what kind of array
		
		String [] seasonsArray = seasonList.toArray(new String[0]);
		
		// will print address of array rather than contents
		System.out.println("seasonsArray: " + seasonsArray);
		
		for (int i = 0; i < seasonsArray.length; i++) {
			System.out.println("seasonsArray[" + i + "]: " + seasonsArray[i]);
		}
		
		
		/*

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		*/

		// will sort the List and WILL change the contents to be sorted
		// (NOT immutable)
		// will sort by ascending order (for now)
		Collections.sort(seasonList);
		System.out.println("sorted: " + seasonList);
		
		
		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		// will reverse order of list and WILL change contents
		Collections.reverse(seasonList);
		System.out.println("after reverse: " + seasonList);

		

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		// syntax is type of object followed by name each element
		// will be referenced by then : then collection (LIst)
		//
		// YOU CANNOUT modify the list you are iterating through
		// while you are iterating
		for (String currentString : seasonList) {
			System.out.println("currentString: " + currentString);
		}
		
		// We can do this with Arrays as well if we don't need the index
		

		/*
		System.out.println("####################");
		System.out.println("       Queue (FIFO)");
		System.out.println("####################");
		System.out.println();
		*/
		
		Queue<String> myQueue = new LinkedList<String>();
		myQueue.offer("FirstItem");
		myQueue.offer("SecondItem");
		myQueue.offer("ThirdItem");
		
		String firstRemoved = myQueue.poll();
		System.out.println("firstRemoved: " + firstRemoved);
			

		/*
		System.out.println("####################");
		System.out.println("       Stack (LIFO)");
		System.out.println("####################");
		System.out.println();
		*/
		
		Stack<String> myStack = new Stack<String>();
		myStack.push("FirstItem");
		myStack.push("SecondItem");
		myStack.push("ThirdItem");
		
		String itemPopped = myStack.pop();
		System.out.println("itemPopped: " + itemPopped);

	}
}
