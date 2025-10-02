package logicBuilding;

public class OverlapTriangles {
	static class Point{
		int x, y;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	static boolean ot (Point l1, Point r1, Point l2, Point r2) {
		if(l1.x>r2.x || l2.x > r1.x) return false;
		if(r1.y > l2.y || r2.y > l1.y) return false;
		
		return true;
	}
	public static void main(String[] args) {
		Point p1 = new Point(0,10);
		Point p2 = new Point(10, 0);
		Point p3 = new Point(5,5);
		Point p4 = new Point(15,0);
		System.out.println(ot(p1,p2,p3,p4));
	}
}
