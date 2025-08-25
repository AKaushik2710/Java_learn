package Classes;

public class Licensee extends Abstract {
	protected String name = "Aman";
	static void license_holder(int age) {
		if(0<age && age<18) {
			System.out.print("YOu can't have a license");
		}
		else{
			System.out.print("Here is your license, have fun while driving");
		}
	}
}
