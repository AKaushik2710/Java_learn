package lab_exam;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;

public class RandomWriter {
	static void insertion(int num) {
		try(FileOutputStream fos = new FileOutputStream(new File("random.txt"), true)){
			fos.write((num+" ").getBytes());
			fos.close();
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
	
	static boolean hasIt(int n) {
		try{
			File f = new File("random.txt");
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextInt()) {
				int num = sc.nextInt();
				if(num==n) return true;
			}
			return false;
		}
		catch(Exception e) {
			System.out.println("Error here");
			return false;
		}
	}
	
	static int randGen() {
		Random r = new Random();
		int num = r.nextInt(196);
		return num;
	}
	public static void main(String[] args) {
		int r = randGen();

		while(hasIt(r)) {
			r=randGen();
		}
		insertion(r);
				
	}
}
