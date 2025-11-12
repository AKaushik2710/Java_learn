package trees;

public class NodeDel {
	static Tree root=null;
	
	static Tree insert(Tree node, int val) {
		Tree temp = new Tree(val);
		if(node==null) {
			node=temp;
		}
		else {
			if(node.getData()>val) {
				node.setLeftChild(insert(node.getLeftChild(), val));
			}
			else {
				node.setRightChild(insert(node.getRightChild(), val));
			}
		}
		return node;
	}
	
	static void inorder(Tree node, String str) {
		if(node==null) return;
		inorder(node.getLeftChild(), str);
		System.out.println(str + " " + node.getData());
		inorder(node.getRightChild(), str);
	}
	
	static Tree delete(Tree node, int key) {
		if(node==null) return null;
		if(key < node.getData()) {
			node.setLeftChild(delete(node.getLeftChild(), key));
		}
		else if (key > root.getData()) {
            node.setRightChild(delete(node.getRightChild(), key));
        } else {
            // Found the node to delete

            // Case 1: No child
            if (node.getLeftChild() == null && node.getRightChild() == null) {
                return null;
            }

            // Case 2: One child
            if (node.getLeftChild() == null) {
                return node.getRightChild();
            } else if (node.getRightChild() == null) {
                return node.getLeftChild();
            }

            // Case 3: Two children
            // Find inorder successor (smallest in right subtree)
            int minVal = findMin(node.getRightChild());
            node.setData(minVal);
            // Delete the inorder successor
            node.setRightChild(delete(node.getRightChild(), minVal));
        }
        return node;
	}
	
	static int findMin(Tree node) {
        int minVal = node.getData();
        while (node.getLeftChild() != null) {
            node = node.getLeftChild();
            minVal = node.getData();
        }
        return minVal;
    }
	
//	static Tree preDel(Tree node, int val) {
//		if(node==null) return null;
//		else if(node.getData()>val) {
//			node.setLeftChild(preDel(node.getLeftChild(), val));
//		}
//		else if(node.getData()<val) {
//			node.setRightChild(preDel(node.getRightChild(), val));
//		}
//		else {
//			if(node.getLeftChild()==null && node.getRightChild()==null) {
//				return null;
//			}
//			
//			if(node.getLeftChild()==null) {
//				return node.getRightChild();
//			}
//			else if(node.getRightChild()==null) {
//				return node.getLeftChild();
//			}
//			else {
//				int minVal = findM(node.getLeftChild());
//				node.setLeftChild(new Tree(minVal));
//				return
//			}
//		}
//	}
	
	static Tree preDel(Tree node, int val) {
		if(node==null) return node;
		
		if(node.getData()>val) {
			node.setLeftChild(preDel(node.getLeftChild(), val));
		}
		else if(node.getData()<val) {
			node.setRightChild(preDel(node.getRightChild(), val));
		}
		else {
			if(node.getLeftChild()==null && node.getRightChild()==null) {
				return null;
			}
			
			if(node.getLeftChild()==null) {
				return node.getRightChild();
			}
			else if(node.getRightChild()==null) {
				return node.getLeftChild();
			}
			
			int minVal = finM(node.getLeftChild());
			node.setData(minVal);
			node.setLeftChild(preDel(node.getLeftChild(), minVal));
		}
		return node;
	}
	
	static int finM(Tree node) {
		int val = node.getData();
		while(node.getRightChild()!=null) {
			val = node.getData();
			node = node.getRightChild();
		}
		return val;
	}
	public static void main(String[] args) {
		int[] arr =  {50,40,60,20,45,70};
		for(int i : arr) {
			root = insert(root, i);
		}
		inorder(root, "Before");
		root=preDel(root, 40);
		inorder(root, "After");
		
		root = insert(root, 35);
		inorder(root, "Current");
	}
}
