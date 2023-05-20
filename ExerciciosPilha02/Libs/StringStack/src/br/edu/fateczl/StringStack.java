package br.edu.fateczl;

public class StringStack {
	
	Node top;

	public StringStack() {
		top = null;
	}
	
	
	public boolean isEmpty() {
		if (top == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(String e) {
		Node element = new Node();
		element.data = e;
		if (isEmpty()) {
			top = element;
		} else {
			element.next = top;
			top = element;
		}
	}
	
	public String pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("There are no elements to unstack");
		}
		String value = top.data;
		top = top.next;
		return value;
	}
	
	public String top() throws Exception {
		if (isEmpty()) {
			throw new Exception("There are no elements to unstack");
		}
		String value = top.data;
		return value;
	}
	
	public int size() {
		int i = 0;
		if (!isEmpty()) {
			Node aux = top;
			i = 1;
			while (aux.next != null) {
				aux = aux.next;
				i++;
			}
		}
		return i;
	}

}
