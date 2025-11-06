package multiThreading;

class Scheduler1 extends Thread{
	private String tName;
	Scheduler1(String name){
		this.tName = name;
	}
	
	public void run () {
		for(int i=0; i<10; i++) {
			System.out.println("I'm thread "+ this.tName + " and I'm responsible for running "+(i+1));
		}
	}
}

class Scheduler2 implements Runnable{
	private String threadName;
	Scheduler2(String name){
		this.threadName = name;
	}
	
	public void run() {
		for(int i=11; i<21; i++) {
			System.out.println("I'm thread "+threadName+" having  charge of task "+i);
//			try {
//				Thread.sleep(1000);
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
		}
	}
}
public class ThreadScheduler {
	public static void main(String[] args)throws InterruptedException {
		Scheduler1 mythread = new Scheduler1("T1");
		Scheduler1 mythread2 = new Scheduler1("T2");
		Scheduler1 mythread3 = new Scheduler1("T3");
		Thread mt1 = new Thread(new Scheduler2("T4"));
		mythread2.start();
		mythread2.join();
		mythread.start();
		mythread3.start();
		mythread3.join();
		mt1.start();
	}
}
