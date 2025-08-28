package assignment2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		EmployeePayrollSystem eps = new EmployeePayrollSystem(1001,"Aman",50000);
		BankAccount ba = new BankAccount(1002,"Kaushik",43000.78f);
		Student[] myStudents = new Student[3];
		Product[] myProducts = new Product[3];
		Book[] myBooks = new Book[3];
		ShoppingCart sCart = new ShoppingCart(r);
		Scanner sc = new Scanner(System.in);
		System.out.println("Press the following keys according to your requirement:-\n"
				+ "a.) Employee Payroll System\t\tb.)Bank Account Management\n"
				+"c.)Student Result Calculation\t\td.)Product Billing System\n"
				+"e.)Library Book Management\t\tf.)Online Shopping Cart");
		String choice = sc.next();
		switch(choice.charAt(0)) {
			case 'a' : 
				System.out.println("The gross Salary of employee is "+eps.grossSalary());
				break;
			case 'b' :
				ba.deposit(5400);
				ba.withdraw(4300);
				System.out.print(ba.balance());
				break;
			case 'c' :
				for(int i=0; i<myStudents.length; i++) {
					int sub1 = r.nextInt(100);
					int sub2 = r.nextInt(100);
					int sub3 = r.nextInt(100);
					myStudents[i] = new Student(i,sub1,sub2,sub3,"AK"+i+1);
				}
				for(int j=0; j<myStudents.length; j++) {
					System.out.println("Average marks of student "+ myStudents[j].name + " is " +myStudents[j].averageMarks());
					myStudents[j].gradeCalculator();
				}
				break;
			case 'd' : 
				for(int i=0; i<myProducts.length; i++) {
					float prod1 = r.nextFloat(1000);
					int prod2 = r.nextInt(10);
					myProducts[i] = new Product(2000+i, "Kaushik" + i, prod1, prod2);
				}
				for(int i=0; i<myProducts.length; i++) {
					System.out.println("The total price for "+ myProducts[i].productName+ " is "+ myProducts[i].totalPrice());
				}
				System.out.println("The total cumulative price for all the products present is "+ myProducts[0].totalProductPrice(myProducts));
				break;
			case 'e' : 
				for(int i=0; i<myBooks.length; i++) {
					int book1 = r.nextInt(10000);
					int book2 = r.nextInt(10);
					boolean book3 = r.nextBoolean();
					int book4 = r.nextInt(10);
					myBooks[i] = new Book(book1, "Kaushik's"+book2, "AK"+book4, book3);
				}
				myBooks[1].issueBook();
				myBooks[0].availableBooks(myBooks);
				break;
			case 'f' : 
				System.out.println("Your total amount comes down to:- Rs."+sCart.total());
				break;
			default : 
				System.out.println("You did not select a valid option!!!");
		}
	}
}
