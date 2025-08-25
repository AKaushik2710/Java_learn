package Classes;
import java.util.Scanner;
public class Example {
	Private info = new Private();
	private String location = "Your birth place is ";
	
	public static void main(String args[]) {
		Private info = new Private();
		Example loc = new Example();
		Private myInfo = new Private();
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter your birth place");
		String pl = inp.next();
		
		System.out.println(info.getPlace());
		System.out.println(loc.location + info.getPlace());
		info.setPlace(pl);
		System.out.println(info.getPlace()+ "  " + myInfo.getPlace());
	}
}
