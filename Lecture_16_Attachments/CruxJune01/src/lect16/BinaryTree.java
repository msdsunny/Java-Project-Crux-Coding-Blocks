package lect16;

import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

		public String toString() {
			String retVal = "";

			if (this.left != null) {
				retVal += this.left.data + " => ";
			}

			retVal += this.data;

			if (this.right != null) {
				retVal += " <= " + this.right.data;
			}

			retVal += "\n";

			if (this.left != null) {
				retVal += this.left.toString();
			}
			if (this.right != null) {
				retVal += this.right.toString();
			}

			return retVal;
		}
	}

	private class Pair {
		int height;
		int diameter;

		Pair(int height, int diameter) {
			this.height = height;
			this.diameter = diameter;
		}
	}

	private Node root;
	private int size;

	public BinaryTree(boolean takeInput) {
		if (takeInput) {
			Scanner scn = new Scanner(System.in);
			this.root = this.takeInput(scn, null, false);
		}
	}

	private Node takeInput(Scanner scn, Node parentNode, boolean isParentsLeftChild) {
		if (parentNode == null) {
			System.out.println("Please enter the data for root: ");
		} else {
			if (isParentsLeftChild) {
				System.out.println("Please enter the data for left child of " + parentNode.data);
			} else {
				System.out.println("Please enter the data for right child of " + parentNode.data);
			}
		}

		int cData = scn.nextInt();
		Node child = new Node(cData, null, null);
		this.size++;

		System.out.println("Do you have a left child for " + child.data);
		boolean isChildsLeft = scn.nextBoolean();

		if (isChildsLeft) {
			child.left = this.takeInput(scn, child, true);
		}

		System.out.println("Do you have a right child for " + child.data);
		boolean isChildsRight = scn.nextBoolean();

		if (isChildsRight) {
			child.right = this.takeInput(scn, child, false);
		}

		return child;
	}

	public void display() {
		System.out.println(this);
	}

	public String toString() {
		return this.root.toString();
	}

	public int size() {
		return this.size(this.root);
	}

	private int size(Node node) {
		if (node == null) {
			return 0;
		}

		int retVal = 1;

		retVal += this.size(node.left);
		retVal += this.size(node.right);

		return retVal;
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}

		int leftHeight = height(node.left);
		int rightHeight = height(node.right);

		return Math.max(leftHeight, rightHeight) + 1;
	}

	public int diameter() {
		// return this.diameter(this.root);
		return this.diameter2(this.root).diameter;
	}

	private int diameter(Node node) {
		if (node == null) {
			return 0;
		}

		int factor1 = diameter(node.left);
		int factor2 = diameter(node.right);
		int factor3 = height(node.left) + height(node.right) + 2;

		return Math.max(factor1, Math.max(factor2, factor3));
	}

	private Pair diameter2(Node node) {
		if (node == null) {
			return new Pair(-1, 0);
		}

		int myHeight = 0, myDiameter = 0;

		Pair lPair = diameter2(node.left);
		Pair rPair = diameter2(node.right);

		// calculating myHeight
		myHeight = Math.max(lPair.height, rPair.height) + 1;

		// calculating myDiameter
		int factor1 = lPair.diameter;
		int factor2 = rPair.diameter;
		int factor3 = lPair.height + rPair.height + 2;

		myDiameter = Math.max(factor1, Math.max(factor2, factor3));

		// creating myPair
		Pair retVal = new Pair(myHeight, myDiameter);
		return retVal;
	}

	public boolean findElement(int item) {
		return this.findElement(this.root, item);
	}

	private boolean findElement(Node node, int item) {
		if (node == null) {
			return false;
		}

		// if(node.data == item){
		// return true;
		// }
		// else{
		// boolean foundInLeft = findElement(node.left, item);
		// if(foundInLeft){
		// return true;
		// }
		// else{
		// boolean foundInRight = findElement(node.right, item);
		// if(foundInRight){
		// return true;
		// }
		// else{
		// return false;
		// }
		// }
		// }
		if (node.data == item) {
			return true;
		} else if (findElement(node.left, item) == true) {
			return true;
		} else if (findElement(node.right, item) == true) {
			return true;
		} else {
			return false;
		}
	}

	public void mirror() {
		this.mirror(this.root);
	}

	private void mirror(Node node) {
		if (node == null) {
			return;
		}

		this.mirror(node.left);
		this.mirror(node.right);

		Node temp = node.left;
		node.left = node.right;
		node.right = temp;
	}

	public BinaryTree mirror2(){
		BinaryTree retVal = new BinaryTree(false);
		
		retVal.root = this.mirror2(this.root);
		
		return retVal;
	}

	private Node mirror2(Node node) {
		if (node == null) {
			return null;
		}

		Node retVal = new Node(node.data, null, null);
		
		retVal.left = this.mirror2(node.right);
		retVal.right = this.mirror2(node.left);
		
		return retVal;
	}

}
