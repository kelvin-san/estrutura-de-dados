package view;

import controller.Recursividades;

public class Main {

	public static void main(String[] args) {
		Recursividades res = new Recursividades();
		
		int[] vetEx1 = {-3, -2, -1, 0, 1, 2, 3};
		int vetEx1Length = vetEx1.length;
		System.out.println("EXERCICIO 1");
		System.out.println(res.sumNat(vetEx1, vetEx1Length));
		
		System.out.println("EXERCICIO 2");
		System.out.println(res.toBin(44));
		
		System.out.println("EXERCICIO 3");
		System.out.println(res.sumDiv(3));
		
		System.out.println("EXERCICIO 4");
		System.out.println(res.nCount(800800, 8));
		
		System.out.println("EXERCICIO 5");
		System.out.println(res.fibonacci(8));
		
		
		System.out.println("EXERCICIO 6");
		System.out.println(res.sumDivFat(3));
		
	}

}
