package my_try;
import java.util.ArrayList;
import java.util.Arrays;
interface myInterface{
	void name();
	void age();
}

interface trialInterface{
	int age=23;
	String myAge(int x);
}

public class Experiment implements myInterface{
	public void name() {
		System.out.println("Hello");
	}
	
	public void age() {
		System.out.println(23);
	}
	public static void main(String[] args) {
		Experiment m = new Experiment();
		m.age();
		trialInterface myT = new trialInterface() {
			public String myAge(int x) {
				System.out.println(x);
				return "A";
			}
		};
		
		myInterface myTYU = new myInterface() {
//			@Override
			public void name() {
				System.out.println("Aman");
			}
			
			@Override
			public void age() {
				System.out.println(20);
			}
		};
		myTYU.name();
		System.out.println(myT.myAge(34));
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		trialInterface ti = (x) -> x+"k"; 
		System.out.println(ti.myAge(4));
		arr.forEach(x -> {System.out.println( x *2);});
	}
}
