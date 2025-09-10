package file_handling;
import java.io.*;

public class Byte_File_Handler_1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("rsm.png");
			int byteData;
			while((byteData = fis.read())!= -1) {
				System.out.println(byteData + "");
			}
			fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
