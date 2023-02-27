package controller;

public class Recursividades {

	public Recursividades() {
		super();
	}
	
	/*
	 *  Exercício 1;
	 *  Condição de parada: Quando o parâmetro n for igual a 1;
	 *  Em função do termo anterior: n = n * ((n-1)!) ...;
	 */
	public int fat(int n) {
		if (n > 12) {
			System.err.println("Valor acima do limite permitido (>12)");
			return 0;
			
		} else {
			if (n == 1) {
				return 1;
				
			} else {
				return n * fat(n-1);
				
			}
		}
	}
	
	/*
	 *  Exercício 2;
	 *  Condição de parada: Quando o tamanho do vetor informado (que no caso funciona como índice) for igual a 0;
	 *  Em função do termo anterior: n = n + (Quantidade de negativos das posições anteriores do vetor);
	 */
	public int nNegatives(int[] vet, int vetLength) {
		if (vetLength < 1) {
			return 0;
			
		} else {
			if (vet[vetLength-1] < 0) {
				return 1 + nNegatives(vet, vetLength-1);
				
			} else {
				return 0 + nNegatives(vet, vetLength-1);
				
			}
			
		}
	}
	
	/*
	 *  Exercício 3;
	 *  Condição de parada: Quando (n/10) for igual a 0;
	 *  Em função do termo anterior: n = n + (Quantidade de dígitos anteriores);
	 */
	boolean isZero = true;
	public int numberLength(double n) {
		if (n == 0) {
			if (isZero == true) {
				return 1;
			} else {
				return 0;
			}
			
		} else {
			isZero = false;
			return 1 + numberLength((int) (n / 10));
			
		}

	}
	
	/*
	 *  Exercício 4;
	 *  Condição de parada: Quando a String contiver 2 caracteres, retornando-os em ordem contrária progressivamente;
	 *  Em função do termo anterior: n = (n*(-1)-1) + (último char de n);
	 */
	int wordLenght = 0;
	public String reverseString(String word) {
		wordLenght = word.length();
		
		if (wordLenght < 2) {
			return word;
			
		} else {
			return reverseString(word.substring(1)) + word.substring(wordLenght-1, wordLenght); // Último char
			
		}
	}
}
