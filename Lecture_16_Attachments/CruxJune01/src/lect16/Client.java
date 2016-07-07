package lect16;

public class Client {

	// 50 true 25 true 37 false false true 12 true 6 false false false true 75 true 87 false false true 62 false false
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree(true);
		bt.display();
		System.out.println(bt.size());
		System.out.println(bt.height());
		System.out.println(bt.diameter());
		
		System.out.println(bt.findElement(877));
		
		
		System.out.println("Display before mirror");
		bt.display();
		
		
		bt.mirror();
		
		System.out.println("Display after mirror");
		bt.display();
		
		System.out.println("Displaying mirrored new tree");
		BinaryTree mirroredTree = bt.mirror2();
		mirroredTree.display();
	}

}
