package controller;

public class StackInt {

	public StackInt() {
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
	
	public void push(int e) {
		Node element = new Node();
		element.data = e;
		if (isEmpty()) {
			top = element;
		} else {
			element.next = top;
			top = element;
		}
	}
	
	public int pop() {
		if (isEmpty()) {
			System.err.println("Não ha elementos para desempilhar");
		}
		int valor = top.data;
		top = top.next;
		return valor;
	}
	
	public int top() {
		if (isEmpty()) {
			System.err.println("Não ha elementos na pilha");
		}
		int value = top.data;
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
