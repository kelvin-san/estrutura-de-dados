package view;

import controller.Conditions;

public class Main {

	public static void main(String[] args) {

		Conditions c = new Conditions();
		int vector[] = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		
		
		System.out.println("Tamanho da pilha: " + c.execConditions(vector));

	}

}
