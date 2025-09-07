package map;
import java.util.HashMap;
import java.util.TreeMap;
public class MyTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();
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
