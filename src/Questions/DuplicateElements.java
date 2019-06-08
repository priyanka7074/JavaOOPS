package Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		String names[] = {"Java","JavaScript","Ruby","C","Python","Java"};
		
		//1. Compare each element
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is: "+names[i]);
				}
				
			}
		}
		
		//2. Using Hashset :Part of java collection. It stores unique values
		System.out.println("*********");
		Set<String> store = new HashSet<String>();
		
		for(String name:names) {
			if(store.add(name) == false) {
				System.out.println("Duplicate element is: "+name);
			}
		}
		
		//3. Using hashmap
		System.out.println("*********");
		
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name:names) {
			Integer count = storeMap.get(name);
			if(count==null) {
				storeMap.put(name, 1);
			}
			else {
				storeMap.put(name, ++count);
			}
			
		}
		
		
		//get the values from this hashmap
		
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		
		for(Entry<String, Integer> entry:entrySet) {
			
			if(entry.getValue()>1) {
				System.out.println("duplicate element is: "+entry.getKey());
			}
		}
		
	
	}

}
