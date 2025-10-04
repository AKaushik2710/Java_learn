package logicBuilding;

public class PairCubeCount {
	
	static int pcc(int num) {
		int count=0;
		
		for(int i=1; i<Math.cbrt(num); i++) {
			int cube = i*i*i;
			
			int diff = num-cube;
			int cubeRoot =  (int) Math.cbrt(diff);
			if(cubeRoot*cubeRoot*cubeRoot == diff) count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(pcc(35));
	}
}
