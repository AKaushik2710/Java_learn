package inheritance;

public class TrialChild extends TrialParent{
	int id;
	TrialChild(int id){
		super(45);
		this.id = id;
	}
	
	void displayChild() {
		System.out.println(id);
	}
}
