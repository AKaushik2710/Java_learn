package trees;

public class BinarySearchTree {
	Tree root; 
	
	Tree insertion(Tree rTree, int val) {
		if(rTree==null) rTree = new Tree(val);
		else {
			if(rTree.getData()<=val) {
				rTree.setLeftChild(insertion(rTree.getLeftChild(), val));
			}
			else {
				rTree.setRightChild(insertion(rTree.getRightChild(), val));
			}
		}
		return rTree;
	}
	
	private void inorder(Tree root) {
		if(root == null) return ;
		else {
			inorder(root.getLeftChild());
			System.out.println("Root value is "+root.getData());
			inorder(root.getRightChild());
		}
	}
	public static void main(String[] args) {
		BinarySearchTree bst = new  BinarySearchTree();
		int[] arr = {1,2,3,4,5};
		for(int i:arr) {
			bst.root =  bst.insertion(bst.root, i);
		}
		bst.inorder(bst.root);
	}
}
