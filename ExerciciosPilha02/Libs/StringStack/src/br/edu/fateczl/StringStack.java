package br.edu.fateczl;

import br.edu.fateczl.Node;

public class StringStack {

	public StringStack() {
		super();
	}
	
	Node top;
	
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
	
	public String pop() {
		if (isEmpty()) {
			System.err.println("Não ha elementos para desempilhar");
		}
		String value = top.data;
		top = top.next;
		return value;
	}
	
	public String top() {
		if (isEmpty()) {
			System.err.println("Não ha elementos na pilha");
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
