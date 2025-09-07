package set;
import java.util.HashSet;

// Fastest in comparison to TreeSet and LinkedHash due to non-sorting & non-preservation of element's insertion order 
public class MyHashSet {
	public static void main(String[] args) {
		HashSet hash = new HashSet<String>();
		hash.add("A");
		hash.add("B");
		hash.add(1);
		hash.add("A");
		System.out.println(hash);
		System.out.println(hash.contains("n"));
		System.out.println(hash.size());
		
		
	}
}
