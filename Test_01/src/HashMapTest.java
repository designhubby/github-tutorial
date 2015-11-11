import java.util.*;
import java.util.Map.Entry;

public class HashMapTest {
	
	public void testhm(){
		
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		hm1.put(1, "a");
		hm1.put(2, "b");
		hm1.put(3, "c");
		for(Map.Entry<Integer, String> counter: hm1.entrySet()){
			Integer key = counter.getKey();
			String value = counter.getValue();
			System.out.println("Get Value: " + counter.getValue() + "Get Key: " + counter.getKey());
			System.out.println(counter);
		}
		Set<Integer> setcounter = hm1.keySet();
		System.out.println("Set Counter: " + setcounter);
		
		Collection<String> collectionCounter = hm1.values();
		System.out.println("Collection Values: " + collectionCounter);
		
		Set<Integer> setcounter1 = hm1.keySet();
		System.out.println("set counter1: " + setcounter1);
		
		Collection<String> collectionofstrings = hm1.values();
		System.out.println("collection of string values: " + collectionofstrings);
		
		for(Map.Entry<Integer, String> counter1 : hm1.entrySet()){
			System.out.println("Map Entryset of Keys: " + counter1.getKey() + " Map Entry Set of Values:  " + counter1.getValue());
			
		}
		
		
	}
}
