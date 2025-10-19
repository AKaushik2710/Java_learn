package trees;

public class Tree {
	private int data;
	private Tree leftChildNode, rightChildNode;
	Tree(int data){
		this.data = data;
		this.leftChildNode = this.rightChildNode = null;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setLeftChild(Tree tree) {
		this.leftChildNode = tree;
	}
	
	public void setRightChild(Tree tree) {
		this.rightChildNode = tree;
	}
	
	public Tree getLeftChild() {
		return this.leftChildNode;
	}
	
	public Tree getRightChild() {
		return this.rightChildNode;
	}
}
