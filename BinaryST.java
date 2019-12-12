package BST;

public class BinaryST {
	public Node root;
	
	public BinaryST() {
		root = null;
	}
	
	public BinaryST(Node root) {
		this.root = root;
	}
	
	public void BSTInsert (int newNodeData) {
		Node newNode = new Node(newNodeData, null, null);
		if (root == null ) {
			root = newNode;
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
	
	public void BSTPrintInorder(Node root) {  
		Node node = new Node();
		node = root;
		if (node == null) {
		      return;                    
		  }
		  
		  BSTPrintInorder(node.getLeftChild());   
		  System.out.print(node.getData() + " ");                    
		  BSTPrintInorder(node.getRightChild()) ; 
		}
}