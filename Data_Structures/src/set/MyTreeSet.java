package set;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;
// Slowest in comparison to Hash and Linked Hash due to sorting taking place.
public class MyTreeSet {
	public static void main(String[] args) {
		Set<String> myTree = new TreeSet<String>();
		myTree.add("1");
		myTree.add("A");
		Iterator<String> it = myTree.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(myTree);
	}
}
