package inheritance;

public class Child extends Parent {
	public String getInfo() {
		String myInfo = "Roll No. of Student is:- " + location +"\n" + getAge();
		return myInfo;
	}
}
