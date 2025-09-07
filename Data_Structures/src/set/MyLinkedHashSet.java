package set;
import java.util.LinkedHashSet;
// Slow in comparison to HashSet due to insertion order of elements getting preserved but faster than TreeSet due to Sorting not being applied
public class MyLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet myLinkedhash = new LinkedHashSet<String>();
		myLinkedhash.add("Code");
		myLinkedhash.add("Logging");
		System.out.println(myLinkedhash);
	}
}
