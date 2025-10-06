package logicBuilding;

public class ArmstrongNumber {
	static boolean an(int num) {
		String temp = Integer.toString(num);
		int length = temp.length();
		int output =0;
		
		for(char c : temp.toCharArray()) {
			output += (int)Math.pow(c - '0', length);
			System.out.println(c + " "+ output);
		}
		System.out.println(output + " "+num);
		return output==num;
	}
	
	public static void main(String[] args) {
		System.out.println(an(153));
		long m = Integer.MAX_VALUE-1;
		System.out.println(m+1);
	}
}
