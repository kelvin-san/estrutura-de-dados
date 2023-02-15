package controller;

public class Recursividades {
	public Recursividades() {
		super();
	}
	
	public int multBySum(int a, int b) {
		if (b == 1) {
			return a;
			
		} else {
			return a + multBySum(a, b-1);
			
		}
	}
	
	int resto = 0;
	public int remDiv(int dividendo, int divisor) {
		if (dividendo < divisor) {
			return resto;
			
		} else {
			resto = dividendo - divisor;
			return remDiv(resto, divisor);
			
		}
	}
	
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
