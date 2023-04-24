package br.edu.fateczl;

public class IntQueue {
	
	Node start;
	Node end;
	
	public IntQueue() {
		start = null;
		end = null;
	}
	
	public boolean isEmpty() {
		if (start == null && end == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void insert(int value) {
		Node element = new Node();
		element.data = value;
		
		if (start == null) {
			// Fila vazia
			start = element;
			end = element;
			element.next = null;
		} else if (start == end && start != null){
			// Fila de 1 elemento
			end = element;
			start.next = end;
			element.next = null;
		} else {
			// Fila com 2 ou mais elementos
			end.next = element;
			element.next = null;
			end = element;
		}
	}
	
	public int remove() throws Exception {
		// Fila vazia
		if (isEmpty()) {
			throw new Exception("The queue is empty");
		}
		
		Node aux = start;
		
		if (start == end && end != null) {
			// Fila de 1 elemento
			start = null;
			end = null;
		} else {
			// Fila de 2 ou mais elementos
			start = start.next;
		}
		
		return aux.data;
	}
	
	public void list() throws Exception {
		if (isEmpty()) {
			throw new Exception("The queue is empty");
		}
		
		Node aux = start;
		while (aux != null) {
			System.out.print(aux.toString() + " => ");
			aux = aux.next;
		}
		System.out.print("null\n");
	}
	
	public int size() {
		int c = 0;
		if (!isEmpty()) {
			Node aux = start;
			while (aux != null) {
				c++;
				aux = aux.next;
			}
		}
		return c;
	}
	
}
