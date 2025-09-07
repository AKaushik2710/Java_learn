package my_try;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
public class FileHandling {
	static void fileCreation() {
		try {
			File myFile = new File("trial.txt");
			if(myFile.createNewFile()) {
				System.out.println("File name is "+myFile.getName());
				Scanner sc= new Scanner(System.in);
				System.out.println("Would you like to write to your file:-\na.)Yes\t\tb.)No");
				String choice = sc.next();
				switch(choice.charAt(0)) {
					case 'a':
						System.out.println("Enter whatever you would like to write to your file:-");
						sc.nextLine();
						String text = sc.nextLine();
						FileWriter Writer = new FileWriter("trial.txt");
						Writer.write(text);
						Writer.close();
						FileReader Reader = new FileReader("trial.txt");
						Scanner content = new Scanner(Reader);
						String data ="";
						while(content.hasNextLine()) {
							data+= content.nextLine();
						}
						System.out.println("The text you entered in your file was :- \n"+data);
						Reader.close();
						content.close();
						System.out.println("Would you like to delete this file:-\na.)Yes\t\tb.)No");
						choice = sc.next();
						switch(choice.charAt(0)) {
						case 'a':
							File deleter = new File("trial.txt");
							if(deleter.delete()) {
								System.out.println(deleter.getName()+" has been deleted.");
							}
							break;
						}
						break;
					case 'b':
						File deleter = new File("trial.txt");
						if(deleter.delete()) {
							System.out.println(deleter.getName()+" has been deleted.");
						}
						System.out.println("OK! Process Exited.");
						break;
				}
				sc.close();
			}
			else {
				if(myFile.exists()) {
					File deleter = new File("trial.txt");
					if(deleter.delete()) {
						System.out.println("File was existing already but has been deleted.");
						System.out.println(deleter.getName()+" has been deleted.");
					}
				}
//				System.out.println("File already exists.");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static void renameFile(String newName) {
		File myFile = new File("trial.txt");
		if(myFile.exists()) {
			File modified = new File(newName);
			if(myFile.renameTo(modified)) System.out.println("Renamed to "+modified.getName());
		}
	}
	public static void main(String[] args) {
//		fileCreation();
		renameFile("NewFile.txt");
	}
}
