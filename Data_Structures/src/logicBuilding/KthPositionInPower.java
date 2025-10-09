package logicBuilding;

public class KthPositionInPower {
	static int kPosition(int a, int b, int k) {
		int res = (int) Math.pow(a, b);
		int temp=res;
		int count=1;
		while(temp!=0) {
			int comp = temp%10;
			temp=temp/10;
			if(count==k) return comp;
			count++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(kPosition(5, 2, 2));
	}
}
