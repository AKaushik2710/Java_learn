package array;

public class PrintAlternates {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		boolean odd = false;
		for(int i : arr) {
			if(!odd) {
				odd = true;
				System.out.println(i);
			}
			else odd = false;
		}
	}
}
