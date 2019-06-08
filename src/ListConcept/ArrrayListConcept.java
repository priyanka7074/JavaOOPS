package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrrayListConcept {

public static <E> void main(String[] args) {
		
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
		
		//generic vs non-generic:
		//generic means you are allowed to enter specific data types and also different data types
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		//ar1.add("Tom"); //not allowed since we restricted the arraylist to integers
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
		//Employee class objects:
		Employee e1 = new Employee("Priya", 34, "QA");
		Employee e2 = new Employee("Tom", 35, "Dev");
		Employee e3 = new Employee("Peter", 36, "Admin");
		
		//create ArrayList:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Iterator to traverse the values
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("**********");
		
		//addAll() -- to merge two array list
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("QTP");
		

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("javascript");
		
		ar5.addAll(ar6);
		
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("**********");
		
		//removeAll():
		ar5.removeAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("**********");
		
		
		//retainAll(): only common element will be printed
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("selenium");
		ar7.add("QTP");
		

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("java");
		
		
		ar7.retainAll(ar8);
		for(int i=0;i<ar7.size();i++) {
			System.out.println(ar7.get(i));
		}
		
		
		
		
		

	}

}
