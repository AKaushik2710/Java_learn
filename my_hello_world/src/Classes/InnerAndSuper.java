package Classes;

 class Outer{
	int age = 23;
	
	void myMethod() {
		Inner i = new Inner();
		System.out.println(i.name);
	}
	private class Inner{
		String name = "Aman";
	}
}


public class InnerAndSuper extends Outer {
	int age =25;
	
	 int ageReturner() {
		return super.age;
	}
	public static void main(String[] args) {
		Outer o = new Outer();
		InnerAndSuper ias = new InnerAndSuper();
		o.myMethod();
		/*Outer.Inner parent = o.new Inner();
		Outer.Inner i = ias.new Inner();
		System.out.println(ias.ageReturner()+" "+i.name + " "+parent.name);*/
	}
}
