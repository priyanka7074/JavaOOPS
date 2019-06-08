package OOPSConceptsPart1;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//can contain duplicate values/elements
		//maintains insertion order
		//synchronized
		//allows random access to fetch the elements because it stores the values on the basis of indexes
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add("Hello");
		ar.add(12.33);
		ar.add('M');
		ar.add(600);
		
		
		
		System.out.println("****");
		System.out.println(ar.size());
		ar.remove(9); //removing one array variable
		System.out.println(ar.size());
		
		System.out.println(ar.get(4)); //passing index value of 4
		
		//print all the values of array loop
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		//ar1.add("Tom"); //not allowed since we restricted the arraylist to integers

	}

}
