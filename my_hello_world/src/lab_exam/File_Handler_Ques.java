package lab_exam;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Product implements Serializable{
	private int pid, quantity;
	private String pname;
	private double price;
	Product(int id, int quantity, String name, double price){
		this.pid = id;
		this.quantity = quantity;
		this.pname = name;
		this.price = price;
	}
	
	void setId(int val) {
		this.pid = val;
	}
	
	void setQ(int val) {
		this.quantity = val;
	}
	
	void setVal(String name) {
		this.pname = name;
	}
	
	void setVal(double price) {
		this.price = price;
	}
	
	int getId() {
		return this.pid;
	}
	
	int getQ() {
		return this.quantity;
	}
	
	double getPrice() {
		return this.price;
	}
	
	String getName() {
		return this.pname;
	}
	
	@Override
	public String toString() {
		return "PID -"+ getId() +" PNAME -"+getName()+" Price -"+ getPrice() + " Quantity -"+getQ();
	}
}

public class File_Handler_Ques {
	void insertion(Scanner sc, String fname) {
		try {
			int pid, quantity;
			String pname;
			double price;
			System.out.println("Enter Id");
			pid = sc.nextInt();
			System.out.println("Enter quantity");
			quantity = sc.nextInt();
			System.out.println("Enter name");
			sc.nextLine();
			pname = sc.nextLine();
			System.out.println("Enter price");
			price = sc.nextDouble();
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname));
			Product p = new Product(pid,quantity,pname, price);
			oos.writeObject(p);
			oos.close();
		}
		catch(Exception e) {
			System.out.println("Following Exception occured."+e);
		}
	}
	
	void reader(String fname) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname))){
			ArrayList<Product> ap = new ArrayList<>();
			int p;
			Product pr;
			System.out.println("Here");
			while(true) {
				try {
					pr = (Product)ois.readObject();
					ap.add(pr);
					System.out.println("Running");
				}
				catch(EOFException eof) {
					break;
				}
			}
			
			for(Product l : ap) {
				System.out.println(l);
			}
		}
		catch(Exception e) {
			System.out.println("Following Exception occured."+e);
		}
	}
	public static void main(String[] args) {
		File_Handler_Ques fhq = new File_Handler_Ques();
		Scanner sc = new Scanner(System.in);
//		fhq.insertion(sc, "Prod.txt");
		fhq.reader("Prod.txt");
	}
}
