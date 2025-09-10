package file_handling;
import java.io.*;
import java.util.Scanner;
public class File_Handler_6 {
	public static void main(String[] args) {
		try {
//			FileWriter fw = new FileWriter("writer.txt");
//			fw.write("sdfgfg");
//			fw.write("Second line");
//			fw.close();
//			FileReader fr = new FileReader("writer.txt");
//			Scanner sc = new Scanner(fr);
//			if(sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//			}
			BufferedReader br = new BufferedReader(new FileReader("writer.txt"));
			String line;
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
