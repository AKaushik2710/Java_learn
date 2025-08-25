package Classes;
import java.util.Scanner;
import inheritance.Parent;
public class Main extends Parent {
	public static void main(String args[]) {
		Voter individual = new Voter();
//		Parent p = new Parent();
		Main m = new Main();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age:-");
		int age = input.nextInt();
		individual.valid_voter(age);
		Licensee.license_holder(age);
		Licensee lic = new Licensee();
//		Abstract abs = new Abstract();
		System.out.print(lic.name+ "   " + lic.lName + m.location);
	}
}
