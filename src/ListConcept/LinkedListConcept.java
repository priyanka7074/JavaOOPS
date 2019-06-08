package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		System.out.println("contents of linkedlist:"+ll);
		//addfirst:
		ll.addFirst("Priyanka");
		//addlast:
		ll.addLast("Automation");
		System.out.println("contents of linkedlist with added first and last:"+ll);
		
		//get:
		System.out.println(ll.get(0));
		
		//set:
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove first and last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("contents of linkedlist after removing first and last:"+ll);
		ll.remove(2);
		System.out.println("contents of linkedlist after removing second index:"+ll);
		
		System.out.println("Using for loop");
		//how to print all the values of linkedlist
		//1. For Loop
		for(int n=0;n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		
		//2.Using advanced for loop:
		System.out.println("Using  advanced for loop");
		for (String str:ll) {
			System.out.println(str);
		}
		
		//3.Using iterator
		System.out.println("Using Iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//4. While loop
		System.out.println("Using While loop");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
		
	}

}
