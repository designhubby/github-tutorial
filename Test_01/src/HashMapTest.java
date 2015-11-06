import java.util.*;
import java.util.HashMap;
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
		
		
	}
}
