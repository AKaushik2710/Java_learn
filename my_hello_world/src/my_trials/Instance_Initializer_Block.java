package my_trials;

class Block{
	int num;
	Block(){
		System.out.println("Inside parent constructor.");
		num=20;
	}
}

class Piece extends Block{
	int num;
	{
		System.out.println("Inside child block.");
		num =30;
	}
	Piece(){
		System.out.println("Inside child cosntructor.");
	}
}
public class Instance_Initializer_Block {
	public static void main(String[] args) {
		Block p = new Piece();
		System.out.println(p.num);
	}
}
