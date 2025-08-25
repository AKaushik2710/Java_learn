package Classes;

public class Voter {
	public static void valid_voter(int age) {
		if(0< age && age <18) {
			System.out.println("Individual is not a valid voter");
		}
		else {
			System.out.println("Individual is a valid voter");
		}
	}
}
