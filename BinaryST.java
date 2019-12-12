package BST;

public class BinaryST {
	public Node root;
	
	public BinaryST() {
		root = null;
	}
	
	public BinaryST(Node root) {
		this.root = root;
	}
	
	public void BSTInsert (Node newNode) {
		if (root == null ) {
			root = newNode;
			root.setLeftChild(null);
			root.setRightChild(null);
		}
		else {
			Node cur = root;
			while (cur != null) {
				if(newNode.getData() < cur.getData()) {
					if(cur.getLeftChild() == null) {
						cur.setLeftChild(newNode);
						cur = null;
					}
					else {
						cur = cur.getLeftChild();
					}
				}
				else {
					if(cur.getRightChild() == null) {
						cur.setRightChild(newNode);
						cur = null;
					}
					else {
						cur = cur.getRightChild();
					}
				}
			}
			newNode.setLeftChild(null);
			newNode.setRightChild(null);
		}
	}
	
	public static void main(String[] args) {
		
	}
}
