package BST;

public class Node {
	private int data;
	private Node leftChild;
	private Node rightChild;

	public Node() {
		setData(-1);
		setLeftChild(null);
		setRightChild(null);
	}

	public Node(int data, Node leftChild, Node rightChild) {
		this.setData(data);
		setLeftChild(leftChild);
		setRightChild(rightChild);
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}
