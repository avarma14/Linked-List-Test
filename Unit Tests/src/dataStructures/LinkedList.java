package dataStructures;

public class LinkedList {
	private int size;
	private Node head;
	
	public LinkedList() {
		this.size = 0;
	}
	
	public void push(String value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = this.head;
		
		this.head = newNode;
		this.size++;
	}
	
	public int size() {
		return this.size++;
	}
	
	public String get(int index) {
		Node current = this.head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.value;
	}
	
	/*public String remove(int index) {
		Node current = this.head;
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		Node temp = current.next;
		current.next = temp.next;
		
		this.size--;
		return temp.value;
	}
	*/
	
	private static class Node {
		public Node next;
		public String value;
	}	
}
