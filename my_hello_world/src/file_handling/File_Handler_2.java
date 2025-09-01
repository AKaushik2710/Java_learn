package file_handling;
import java.io.FileWriter;
import java.io.IOException;
public class File_Handler_2 {
	public static void main(String[] args) {
		try {
			FileWriter myFile = new FileWriter("trial.txt");
			myFile.append("It's my second time writing to a file in java.");
			myFile.close();
		}
		catch(IOException e) {
			System.out.println("Some error occured while writing.");
		}
	}
}
