package inheritance;

public class Main {
	public static void main(String args[]) {
		Child info = new Child();
		info.location = "Dhamar";
		System.out.print(info.getInfo()+ info.location);
	}
}
