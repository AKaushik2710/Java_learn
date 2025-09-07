package file_handling;
import java.io.*;
import java.util.Scanner;
public class File_Handler_3 {
	public static void main(String[] args) {
		try {
			File myFile = new File("trial.txt");
			FileReader myFile_2 = new FileReader("trial.txt");
//			System.out.println(myFile_2.read());
			Scanner sc = new Scanner(myFile);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
	}
}
