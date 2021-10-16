// Java Program to Create Set of Pairs
// using HashSet

// Importing required classes
import java.io.*;
import java.util.HashSet;

// Class 1
// Helper class for creating pairs
class Pair {

	// Pair attributes
	public int index;
	public int value;

	// Constructor to initialize pair
	public Pair(int index, int value)
	{
		// This keyword refers to current instance
		this.index = index;
		this.value = value;
	}
}

// Class 2
// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Initializing an array of Pair
		// Custom input elements
		Pair arr[] = new Pair[4];
		arr[0] = new Pair(2, 3);
		arr[1] = new Pair(3, 4);
		arr[2] = new Pair(5, 10);
		arr[3] = new Pair(3, 4);

		// Creating a hashSet by
		// declaring object of string type
		HashSet<String> set = new HashSet<>();

		// Adding pair in set in form of string
		for (int i = 0; i < 4; i++) {
			set.add(arr[i].index + ", " + arr[i].value);
		}

		// Lastly iterating using for each loop annd
		// printing the elements pairs
		for (String e : set)
			System.out.println("(" + e + ")");
	}
}
