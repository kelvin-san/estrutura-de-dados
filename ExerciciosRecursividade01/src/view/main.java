package view;

import controller.Recursividades;

public class main {

	public static void main(String[] args) {
		Recursividades Rec = new Recursividades();
		
		System.out.println("EXERCICIO 1:");
		System.out.println(Rec.multBySum(2, 5));
		
		System.out.println("EXERCICIO 2:");
		System.out.println(Rec.remDiv(9, 5));
		
		int[] vet = {1, 2, 3, 4, 5};
		int vetLenght = vet.length;
		System.out.println("EXERCICIO 3:");
		System.out.println(Rec.nPairs(vet, vetLenght));
	}

}
