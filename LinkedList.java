package datastructure.studt.dalpha;


import java.util.List;
import java.util.ArrayList;

public class LinkedList {
	
	class Node {
		protected int data;
		protected Node nextNode = null;
		
		public Node (int data) {
			this.data = data;
		}
	}
	

	protected List<Node> list = new ArrayList<Node>();
	protected Node head = null;
	protected Node tail = null;
	protected Node cur = null;

	public void insertNode (Node node) {
		if (list.isEmpty()) {
			list.add(node);
			head = node;
			tail = node;
			cur = node;
		}
		
		else {
			list.add(node);
			cur.nextNode = node;
			cur = node;
			tail = node;
		}
		return;
	}
	
	public void deleteNode (Node node) {
		if (list.isEmpty()) {
			System.out.println("There are no elements");
			return;
		}
		
		cur = list.get(list.size() - 1);
		tail = list.get(list.size() - 1);
		list.remove(node);

		if (list.isEmpty()) {
			head = null;
			tail = null;
			cur = null;
		}
		return;
	}
	
	
	
}
