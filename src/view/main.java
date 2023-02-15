package view;

import controller.Recursividades;

public class main {

	public static void main(String[] args) {
		Recursividades Rec = new Recursividades();
		
		int[] vet = {1, 2, 3, 4, 5};
		int vetLenght = vet.length;
		
		System.out.println(Rec.multBySum(2, 5));
		System.out.println(Rec.remDiv(24, 5));
		System.out.println(Rec.nPairs(vet, vetLenght));
	}

}
