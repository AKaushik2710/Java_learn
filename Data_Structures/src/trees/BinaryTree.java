package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	Tree root;
	void insert (int val) {
		Tree newTree = new Tree(val);
		
		if(root==null) {
			root = newTree;
			return;
		}
		
		Queue<Tree> treeQueue = new LinkedList<>();
		treeQueue.add(root);
		
		while(!treeQueue.isEmpty()) {
			Tree temp = treeQueue.poll();
			
			if(temp.getLeftChild()==null) {
				temp.setLeftChild(newTree);
				break;
			}
			else {
				treeQueue.add(temp.getLeftChild());
			}
			
			if(temp.getRightChild()==null) {
				temp.setRightChild(newTree);
				break;
			}
			else {
				treeQueue.add(temp.getRightChild());
			}
		}
		
	}
	
	void inorder(Tree root) {
		if(root == null) return;
		inorder(root.getLeftChild());
		System.out.println("The root value is "+root.getData());
		inorder(root.getRightChild());
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		BinaryTree bt = new BinaryTree();
		for(int i : arr) {
			bt.insert(i);
		}
		
		bt.inorder(bt.root);
	}
}
