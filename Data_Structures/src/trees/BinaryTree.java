package trees;

class Tree{
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
public class BinaryTree {
	static Tree insert (Tree t, int val) {
		if (t==null) t = new Tree(val);
		
		if(t.getLeftChild()==null) {
			t.setLeftChild(new Tree(val));;
		}
		else if(t.getRightChild()==null) {
			t.setRightChild(new Tree(val));;
		}
		else {
			insert(t, val);
		}
		return t;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Tree root = null;
//		for(int i=0; i<arr.length;i++) {
//			if(arr[i]>root.getData()) {
//				if(root.getLeftChild()==null) {
//					root.setLeftChild(new Tree(root.getData()));
//				}
//				else if(root.getRightChild()==null) {
//					root.setRightChild(new Tree(root.getData()));
//				}
//				else if(root)
//				root.setData(arr[i]);
//			}
//			if(root==null) root = new Tree(arr[i]);
//			else if(root.getLeftChild()==null) {
//				root.setLeftChild(new Tree(arr[i]));
//				root= root.getLeftChild();
//			}
//			else if(root.getRightChild()==null){
//				root.setRightChild(new Tree(arr[i]));
//			}
//		}
		root = insert(root, 1);
		System.out.println(root.getData());
	}
}
