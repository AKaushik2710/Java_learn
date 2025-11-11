package trees;


public class TreeMaking {
	static Tree root=null;
	
	static Tree insert(Tree temp, int val) {
		if(temp==null) {
			temp = new Tree(val);
		}
		else {
			if(val<temp.getData()) {
				temp.setLeftChild(insert(temp.getLeftChild(), val));
			}
			else {
				temp.setRightChild(insert(temp.getRightChild(), val));
			}
		}
		return temp;
	}
	
	static void inorder(Tree root) {
		if(root == null) return;
		inorder(root.getLeftChild());
		System.out.println("The root value is "+root.getData());
		inorder(root.getRightChild());
	}
	
	static void preorder(Tree root) {
		if(root==null) return ;
		System.out.println(root.getData());
		preorder(root.getLeftChild());
		preorder(root.getRightChild());
//		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {50,40,60,20,45,70};
		for(int i : arr) {
			root = insert(root, i);
		};
		inorder(root);
//		preorder(root);
	}
}
