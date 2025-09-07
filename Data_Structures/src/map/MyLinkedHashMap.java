package map;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class MyLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> myMap = new LinkedHashMap<Integer, String>();
		myMap.put(1, "One");
		myMap.put(2,  "Two");
		myMap.put(3,  "Three");
		System.out.println(myMap);
		System.out.println(myMap.get(3));
		for(Integer i : myMap.keySet()) {
			System.out.println(myMap.get(i));
		}
	}
}
