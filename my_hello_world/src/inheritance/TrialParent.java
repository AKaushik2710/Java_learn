package inheritance;

public class TrialParent {
	int age;
	TrialParent(){
		age = 23;
		System.out.println("I ran");
	}
	TrialParent(int age){
		this();
		this.age  = age;
		System.out.println("I am Parameter");
	}
	
	void displayParent() {
		System.out.println("Age of Parent is "+age);
	}
}
