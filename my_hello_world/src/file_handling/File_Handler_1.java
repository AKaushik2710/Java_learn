package file_handling;
import java.io.File;
import java.io.IOException;
public class File_Handler_1 {
	public static void main(String[] args) {
		File myFile = new File("trial.txt");
		try {
			if(myFile.createNewFile()) {
				System.out.println("Created File's Name is "+myFile.getName());
			}
			else {
				System.out.println("File Already Exists");
			}
		}
		catch(IOException e) {
			System.out.println("There was some trouble creating this file.");
		}
	}
}
