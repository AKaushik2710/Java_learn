package file_handling;
import java.io.*;
public class File_Handler_4 {
	public static void main(String[] args) {
		File myFile = new File("trial.txt");
		try {
			if(myFile.delete()) {
				System.out.println("File "+myFile.getName()+" is deleted successfully");
			}else {
				System.out.println("File was not deleted");
			}
		}
		finally {
			System.out.println("Operation was executed");
		}
	}
}
