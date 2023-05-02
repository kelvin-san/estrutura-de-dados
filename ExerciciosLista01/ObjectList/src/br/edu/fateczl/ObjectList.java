package br.edu.fateczl;

public class ObjectList {
	
	Node start;
	
	public ObjectList() {
		start = null;
	}
	
	public boolean isEmpty() {
		if (start == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		int i = 0;
		if (!isEmpty()) {
			Node aux = start;
			while (aux != null) {
				i++;
				aux = aux.next;
			}
		}
		return i;
	}
	
	private Node getNo(int pos) throws Exception {
		if (isEmpty()) {
			throw new Exception("The queue is empty");
		}
		
		int size = size();
		if (pos < 0 || pos > size - 1) {
			throw new Exception("Invalid position for this list");
		}
		
		Node node = start;
		int i = 0;
		while (i < pos) {
			node = node.next;
			i++;
		}
		return node;
	}
	
	public void addFirst(Object value) {
		Node element = new Node();
		element.data = value;
		element.next = start;
		start = element;
	}
	
	public void addLast(Object value) throws Exception {
		if (isEmpty()) {
			addFirst(value);
		} else {
			int size = size();
			Node element = new Node();
			
			element.data = value;
			element.next = null;
			
			Node last = getNo(size - 1);
			last.next = element;
		}
	}
	
	public void add(Object value, int pos) throws Exception {
		int size = size();
		if (pos < 0 || pos > size - 1) {
			throw new Exception("Invalid position for this list");
		}
		
		if (pos == 0) {
			addFirst(value);
		} else if (pos == size) {
			addLast(value);
		} else {
			Node element = new Node();
			element.data = value;
			
			Node prev = getNo(pos - 1);
			element.next = prev.next;
			prev.next = element;
		}
	}
	
	public void removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("The queue is empty");
		}
			start = start.next;
	}
	
	public void removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("The queue is empty");
		}
		
		int size = size();
		if (size == 1) {
			removeFirst();
		} else {
			Node penult = getNo(size - 2);
			penult.next = null;
		}
	}
	
	public void remove(int pos) throws Exception {
		if (isEmpty()) {
			throw new Exception("The queue is empty");
		}
		
		int size = size();
		if (pos < 0 || pos > size - 1) {
			throw new Exception("Invalid position for this list");
		}
		
		if (pos == 0) {
			removeFirst();
		} else if (pos == size - 1) {
			removeLast();
		} else {
			Node prev = getNo(pos - 1);
			Node current = getNo(pos);
			prev.next= current.next;
		}
	}
	
	public Object get(int pos) throws Exception {
		if (isEmpty()) {
			throw new Exception("The queue is empty");
		}
		
		int size = size();
		if (pos < 0 || pos > size - 1) {
			throw new Exception("Invalid position for this list");
		}
		
		int i = 0;
		Node aux = start;
		while (i < pos) {
			aux = aux.next;
			i++;
		}
		return aux.data;
	}
	
}
