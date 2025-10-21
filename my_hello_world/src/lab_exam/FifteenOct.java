package lab_exam;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	int data;
	TreeNode left, right;
	TreeNode(int data){
		this.data = data;
		left = right = null;
	}
	
}
public class FifteenOct {
	TreeNode root;
	void treeCreator(int val) {
		if(root == null) {
			root = new TreeNode(val);
			return;
		}
			Queue<TreeNode> nodes = new LinkedList<>();
			nodes.add(root);
			
			while(!nodes.isEmpty()) {
				TreeNode node = nodes.poll();
				if(node.left==null) {
					root.left = new TreeNode(val);
					break;
				}
				else {
					nodes.add(node.left);
				}
				
				if(node.right==null) {
					node.right = new TreeNode(val);
					break;
				}
				else {
					nodes.add(node.right);
				}
			}
			
	}
	
	void inorder(TreeNode root) {
		if(root==null) return;
		
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		FifteenOct bt = new FifteenOct();
		for(int i : arr) {
			bt.treeCreator(i);
		}
		
		bt.inorder(bt.root);
	}
}
