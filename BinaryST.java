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
	
	public boolean BSTRemove(int key) {
		boolean found = false;
		Node par = new Node();
		Node cur = new Node();
		par = null;
		cur = root;
		while(cur != null && !found) {
			if(cur.getData() == key) {
				if (cur.getLeftChild() == null && cur.getRightChild() == null) {
					if(par == null) {
						root = null;
					}
					else if(par.getLeftChild().equals(cur)){
						par.setLeftChild(null);
					}
					else {
						par.setRightChild(null);
					}
				}
				else if (cur.getLeftChild() != null && cur.getRightChild() == null) {
					if (par == null) {
						root = cur.getLeftChild();
					}
					else if (par.getLeftChild().equals(cur)) {
						par.setLeftChild(cur.getLeftChild());
					}
					else {
						par.setRightChild(cur.getLeftChild());
					}
				}
				else if (cur.getLeftChild() == null && cur.getRightChild() != null) {
					if(par == null) {
						root = cur.getRightChild();
					}
					else if(par.getLeftChild().equals(cur)) {
						par.setLeftChild(cur.getRightChild());
					}
					else {
						par.setRightChild(cur.getRightChild());
					}
				}
				else {
					Node suc = new Node();
					suc = cur.getRightChild();
					while(suc.getLeftChild() != null) {
						suc = suc.getLeftChild();
					}
					int successorData = suc.getData();
					BSTRemove(suc.getData());
					cur.setData(successorData);
				}
				found = true;
			}
			else if(cur.getData() < key) {
				par = cur;
				cur = cur.getRightChild();
			}
			else {
				par = cur;
				cur = cur.getLeftChild();
			}
		}
		
		return found;
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
	public boolean BSTFind(int key) {  
		return BSTFindRecursive(root, key);
	}
	
	private boolean BSTFindRecursive(Node node, int key) {
		boolean found = false;
		if (node != null) {
			if (key == node.getData()) {
				found = true;
			}
			else if (key < node.getData()) {
				return BSTFindRecursive(node.getLeftChild(), key);
			}
			else {
				return BSTFindRecursive(node.getRightChild(), key);
			}
		}
		return found;
	}
	public int maxDepth(Node node) {
		   if (node == null) {
			   return 0;
		   }
		   else {
			   int leftDepth = maxDepth(node.getLeftChild());
			   int rightDepth = maxDepth(node.getRightChild());
			   return Math.max(leftDepth, rightDepth) + 1;
		   }
		}
}