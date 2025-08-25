package assignment;

import java.util.Scanner;

public class Main {
	int electricbill(int unit) {
		int fare=0;
		if(unit>0) {
			if(unit<=100) {
				fare = unit;
			}
			else if(unit >100 && unit <= 200) {
				fare = 100 + (unit%100)*2;
			}
			else if(unit >200 && unit <=300) {
				fare = 300 + (unit%200)*3;
			}
			else {
				fare = 600 + (unit-300)*4;
			}
		}
		else {
			fare=0;
		}
		return fare;
	}
	
	void validuser(String id, String pass) {
		if(id.equals("admin") && pass.equals("admin123")) {
			System.out.print("User Successfully Logged In");
		}
		else {
			System.out.print("User did not login successfully");
		}
	}
	public static void main(String args[]) {
		Main bill = new Main();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Which method would you like to test :-\nA.)ElectricBill Calculator \t\tB.)User Login\n Enter your choice:- ");
		String choice = input.next();
		
		if(choice.equals("A")) {
			System.out.print("Enter the electricity units consumed:- ");
			int units = input.nextInt();
			System.out.print(bill.electricbill(units));
		}
		else if(choice.equals("B")) {
			System.out.print("Enter Username:- ");
			String username = input.next();
			System.out.println("Enter Password:- ");
			String password = input.next();
			bill.validuser(username, password);
		}
	}
}
