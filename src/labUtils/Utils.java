package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		t.addRoot(4);
		Position<Integer> pos9=t.addChild(t.root(), 9);
		t.addChild(pos9, 7);
		t.addChild(pos9, 10);
		
		Position<Integer> pos20=t.addChild(t.root(), 20);
		Position<Integer> pos15=t.addChild(pos20, 15);
		Position<Integer> pos21=t.addChild(pos20, 21);
		
		t.addChild(pos15, 12);
		Position<Integer> pos17=t.addChild(pos15, 17);
		t.addChild(pos17, 19);
		Position<Integer> pos40=t.addChild(pos21, 40);
		t.addChild(pos40, 30);
		t.addChild(pos40, 50);
		
		
		
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		t.addRoot(4);
		Position<Integer> pos9=t.addLeft(t.root(), 9);
		t.addLeft(pos9, 7);
		t.addRight(pos9, 10);
		
		Position<Integer> pos20=t.addRight(t.root(), 20);
		Position<Integer> pos15=t.addLeft(pos20, 15);
		Position<Integer> pos21=t.addRight(pos20, 21);
		
		t.addLeft(pos15, 12);
		Position<Integer> pos17=t.addRight(pos15, 17);
		t.addLeft(pos17, 19);
		Position<Integer> pos40=t.addRight(pos21, 40);
		t.addLeft(pos40, 30);
		t.addRight(pos40, 50);
		
		
		return t; 
	}


}
