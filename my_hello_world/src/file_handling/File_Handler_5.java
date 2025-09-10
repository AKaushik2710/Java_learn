package file_handling;
import java.io.*;
import java.io.RandomAccessFile;
public class File_Handler_5 {
	public static void randomAccess() {
		try {
			RandomAccessFile raf = new RandomAccessFile("NewFile.txt", "rw");
			raf.seek(4);
			raf.writeUTF("Writing mid of  file");
			raf.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void bufferedWriter() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("NewFile.txt", true));
			bw.write("Hey, now I'm appending.");
			bw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		bufferedWriter();
	}	
}
