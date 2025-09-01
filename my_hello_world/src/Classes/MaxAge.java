package Classes;
import java.util.Arrays;
class Person{
	int age;
	int id;
	Person(int age, int id){
		this.age = age;
		this.id = id;
	}
}
public class MaxAge {
	public static void main(String[] args) {
		Person[] p = new Person[5];
		p[0] = new Person(12,1001);
		p[1] = new Person(15, 1003);
		p[2] = new Person(10, 1004);
		p[3] = new Person(23, 1002);
		p[4] = new Person(45, 1005);
		int index = 0;
		for(int i=0; i<p.length-1; i++) {
			if(p[i].age == 15) {
				index = i;
				break;
			}
		}
		System.out.println("Element is" + p[index].id + " " +  p[index].age);
	}
}
