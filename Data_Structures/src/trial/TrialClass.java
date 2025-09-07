package trial;

class TrialPlace{
	private int age =78;
	String[] me() {
		String [] arr = {"5","9"};
		System.out.println("Hello World"+age);
		return arr;
	}
}

public class TrialClass{
	private int age =78;
	private String[] me() {
		String [] arr = {"5","9"};
		System.out.println("Hello World"+age);
		return arr;
	}
	
	protected int m=90;
	
	public int giveVar() {
		return age;
	}
}


