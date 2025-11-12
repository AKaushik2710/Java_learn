package trees;

public class NodeDeletionInTree {
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
	
	static Tree locateItem(Tree node, int val) {
		if(node == null) return node;
		else {
			if(node.getData() == val) {
				return node;
			}
			else if(node.getData() > val) {
				if(node.getLeftChild().getData()==val) return node;
				node = locateItem(node.getLeftChild(), val);
			}
			else {
				if(node.getRightChild().getData()==val) return node;
				node = locateItem(node.getRightChild(), val);
			}
		}
		return node;
	}
	
	static Tree selectRightmost(Tree node) {
		if(node.getRightChild()==null||node.getRightChild().getRightChild()==null) {
			return node;
		}
		else {
			node = selectRightmost(node.getRightChild());
		}
		return node;
	}
	
	static void constructIt(Tree node, Tree sub, boolean left) {
		if(node.getData()==sub.getData()) {
			if(left)node.setLeftChild(null);
			else node.setRightChild(null);
		}
		else {
			setNullMost(node, sub);
		}
	}
	static void setNullMost(Tree node, Tree nHead) {
		if(node.getRightChild().getData()==nHead.getData()) {
			node.setRightChild(null);
		}
		else {
			setNullMost(node.getRightChild(), nHead);
		}
	}
	public static void main(String[] args) {
		int[] arr = {50,40,60,20,45,70};
		for(int i : arr) {
			root = insert(root, i);
		};
//		inorder(root);
//		preorder(root);
		Tree p = locateItem(root, 40);
		Tree left = p.getData()>40 ? p.getLeftChild().getLeftChild() : p.getRightChild().getLeftChild();
		Tree right = p.getData()>40 ? p.getLeftChild().getRightChild() : p.getRightChild().getRightChild();
		
//		System.out.println(p.getData());
		if(40==p.getLeftChild().getData()) {
			p.getLeftChild().setLeftChild(null);
			p.getLeftChild().setRightChild(null);
			p.setLeftChild(null);
		}
		else {
			p.getRightChild().setLeftChild(null);
			p.getRightChild().setRightChild(null);
			p.setRightChild(null);
		}
		
		Tree newHead = selectRightmost(right);
		
		if(p.getData()>40) {
			p.setLeftChild(newHead);
			p.getLeftChild().setLeftChild(left);
			p.getLeftChild().setRightChild(right);
			constructIt(p.getLeftChild(), left, true);
		}
		else {
			p.setRightChild(newHead);
			p.getRightChild().setLeftChild(left);
			p.getRightChild().setRightChild(right);
			constructIt(p.getRightChild(), right, false);
		}
//		if(newHead.getLeftChild()!=null && newHead.getRightChild()!=null)setNullMost(right, newHead);
//		else newHead.setRightChild(null);
		/*if(p.getData()>40) {
			p.setLeftChild(newHead);
			p.getLeftChild().setLeftChild(left);
			p.getLeftChild().setRightChild(right);
		}
		else {
			p.setRightChild(newHead);
			p.getRightChild().setLeftChild(left);
			p.getRightChild().setRightChild(right);
		} */
//		System.out.println(p.getData()+" "+p.getLeftChild().getData()+ " "+left.getData()+" "+right.getData());
//		inorder(root);
		System.out.println(root.getData()+" "+root.getRightChild().getData() + " "+newHead.getData()+" "+left.getData()+" "+right.getData());
	}
}
