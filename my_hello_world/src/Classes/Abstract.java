package Classes;

public class Abstract {
	public static void main(String[] args) {
		AbsExample eg = new AbsExample();
		eg.firstName();
		eg.lastName(eg.lName);
	}
}

class AbsExample extends Runner{
	void lastName(String name) {
		System.out.println(name);
	}
}

abstract class Runner{
	String lName = "Kaushik";
	abstract void lastName(String name);
	
	public void firstName() {
		System.out.println("Aman ");
	}

}
