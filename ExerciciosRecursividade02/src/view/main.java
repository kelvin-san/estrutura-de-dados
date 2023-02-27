package view;

import controller.Recursividades;

public class main {

	public static void main(String[] args) {
		Recursividades res = new Recursividades();
		
		
		System.out.println("EXERCICIO 1");
		System.out.println(res.fat(5));
		
		int[] vet = {-2, -1, 0, 1, 2};
		int vetLength = vet.length;
		System.out.println("EXERCICIO 2");
		System.out.println(res.nNegatives(vet, vetLength));
		
		System.out.println("EXERCICIO 3");
		System.out.println(res.numberLength(1024));
		
		System.out.println("EXERCICIO 4");
		System.out.println(res.reverseString("Teste"));
	}

}
