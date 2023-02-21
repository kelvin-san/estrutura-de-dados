package controller;

public class Recursividades {
	public Recursividades() {
		super();
	}
	
	
	// Exercício 1
	public int multBySum(int a, int b) {
		if (b == 1) {
			return a;
			
		} else {
			return a + multBySum(a, b-1);
			
		}
	}
	
	// Exercício 2
	public int remDiv(int dividendo, int divisor) {
		if (dividendo < divisor) {
			return dividendo;
			
		} else {
			return remDiv((dividendo - divisor), divisor);
			
		}
	}
	
	// Exercício 3
	public int nPairs(int[] vet, int vetLenght) {
		if (vetLenght < 1) {
			return 0;
		} else {
			if (vet[vetLenght-1] % 2 == 0) {
				return 1 + nPairs(vet, vetLenght-1);
			} else {
				return nPairs(vet, vetLenght-1);
			}
		}
	}
}
