package view;

import controller.StackInt;

public class Main {

	public static void main(String[] args) throws Exception {
		StackInt s1 = new StackInt();
		StackInt s2 = new StackInt();
		
		System.out.println("Exercicio A\n");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				s1.push(i * i);
			} else {
				if (i <= 5) {
					s1.push(i);
				} else {
					s1.pop();
				}
			}
			s1.top();
		}
		System.out.println("Tamanho da pilha: " + s1.size());
		for (int i = s1.size(); i != 0; i--) {
			System.out.println(s1.pop());
		}
		
		
		
		System.out.println("\n");
		
		
		
		System.out.println("Exercicio B\n");
		for (int i = 100; i < 115; i++) {
			if (s2.isEmpty()) {
				s2.push(i + 100);
			} else {
				if (s2.size() <= 4) {
					s2.push(i + 150);
				} else {
					s2.pop();
				}
			}
			s2.top();
		}
		System.out.println("Tamanho da pilha: " + s2.size());
		for (int i = s2.size(); i != 0; i--) {
			System.out.println(s2.pop());
		}
	
	}

}
