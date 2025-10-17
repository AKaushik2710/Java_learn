package lab_exam;

import java.util.HashSet;
import java.util.Random;

class ThreadMain extends Thread{
	String name;
	ThreadMain(String name){
		this.name = name;
	}
	
	int random() {
		Random r = new Random();
		int num = r.nextInt(1,101);
		return num;
	}
	
	public void run(ThreadSquare t1, ThreadCube t2) {
		HashSet<Integer> hash = new HashSet<>();
		int res;
		int i=0;
		while(i<100) {
			res=random();
			while(true) {
				if(hash.contains(res))res = random();
				else break;
			}
			hash.add(res);
			if(res%2==0) {
				t1.run(res);
			}
			else {
				t2.run(res);
			}
			i++;
		}
	}
	
	
}
class ThreadSquare extends Thread{
	String name;
	ThreadSquare(String name){
		this.name = name;
	}
	
	public void run(int num) {
		System.out.println("Thread "+this.name+" printed "+num*num + " for "+num);
	}
}

class ThreadCube extends Thread{
	String name;
	ThreadCube(String name) {
		this.name = name;
	}
	
	public void run(int num) {
		System.out.println("Thread "+this.name+" printed "+Math.pow(num, 3) + " for "+num);
	}
}
public class ThreadAssignment {
	public static void main(String[] args) {
		ThreadMain t0 = new ThreadMain("T0");
		ThreadSquare t1 = new ThreadSquare("T1");
		ThreadCube t2 = new ThreadCube("T2");
		t0.start();
		t0.run(t1, t2);
		t1.start();
		t2.start();
	}
}
