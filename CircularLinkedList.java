package datastructure.studt.dalpha;

public class CircularLinkedList extends LinkedList {
	
	@Override
	public void insertNode (Node node) {
		if (list.isEmpty()) { 
			list.add(node);
			head = node;
			cur = node;
		} else {
			list.add(node);
			cur.nextNode = node;
			cur = node;
			node.nextNode = head;
		}
	}
	
	@Override
	public void deleteNode (Node node) {
		if (list.isEmpty()) {
			System.out.println("There are no elements");
			return;
		}
		
		cur = list.get(list.size() - 1);
		list.get(list.size() - 1).nextNode = head;
		list.remove(node);
		
		if (list.isEmpty()) {
			head = null;
			tail = null;
			cur = null;
		}
	}

}
