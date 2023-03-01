package controller;

public class Recursividades {
	
	public Recursividades() {
		super();
	}
	
	// Exercício 1
	public int sumNat(int[] vet, int vetLength) {
		// Condição de parada
		if (vetLength < 1) {
			// Verificação de negativos
			if (vet[vetLength] < 0) {
				return 0;
						
			} else {
				return vet[vetLength];
					
			}
		
		// Chamadas dos próximos passos
		} else {
			// Verificação de negativos
			if (vet[vetLength-1] < 0) {
				return 0 + sumNat(vet, vetLength-1);
						
			} else {
				return vet[vetLength-1] + sumNat(vet, vetLength-1);
					
			}
		}
		
	}
	
	// Exercício 2
	public String toBin(int n) {
		if (n < 2) {
			// Condição de parada
			return String.valueOf(n);
			
		} else {
			// Chamadas dos próximos passos
			return String.valueOf(toBin(n / 2) + (n%2));
		
		}
	}
	
	// Exercício 3
	int i = 0;
	public double sumDiv(int n) {
	    if (i == n) {
	    	// Condição de parada
	    	return 0;
	      	
	    } else {
	    	// Chamadas dos próximos passos
	    	i++;
	    	return (1/(double) i) + sumDiv(n);
	    	
	    }
	}
	
	
	// Exercício 4
	public int nCount(int chain, int num) {
		if (chain < 10) {
			// Condição de parada
			if (chain == num) {
				return 1;
				
			} else {
				return 0;
				
			}
		} else {
			// Chamadas dos próximos passos
			if (chain % 10 == num) {
				return 1 + nCount(chain / 10, num);
				
			} else {
				return 0 + nCount(chain / 10, num);
				
			}
			
		}
	}
	
	// Exercício 5
	public int fibonacci(int n) {
		if (n == 1 || n == 2) {
			// Condição de parada
			return 1;
			
		} else {
			// Chamadas dos próximos passos
			return fibonacci(n-1) + fibonacci(n-2);
			
		}
	}
	
	// Exercício 6
	int i2 = 0;
	public double sumDivFat(int n) {
	    if (i2 == n) {
	    	// Condição de parada
	    	return 0;
	      	
	    } else {
	    	// Chamadas dos próximos passos
	    	i2++;
	    	return (1/(double) fat(i2)) + sumDivFat(n);
	    	
	    }
	}
	
	static int fat(int n) {
		if (n == 1) {
			return 1;
			
		} else {
			return n * fat(n-1);
		
		}
	}
	
}
