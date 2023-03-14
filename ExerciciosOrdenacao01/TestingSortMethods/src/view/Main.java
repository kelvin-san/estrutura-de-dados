package view;

import br.edu.fateczl.sortMethods.Sort;

public class Main {

	public static void main(String args[]) {
		Sort sort = new Sort();
		int[] vector = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		int vectorLength = vector.length;
		
		System.out.println("VETOR ORIGINAL: ");
		for (int i = 0; i < vectorLength; i++) {
			System.out.print(vector[i] + " ");
		}
		
		System.out.println("");
		
		System.out.println("VETOR ORDENADO: ");
		vector = sort.bubbleSort(vector);
		// vector = sort.mergeSort(vector, 0, 1);
		for (int i = 0; i < vectorLength; i++) {
			System.out.print(vector[i] + " ");
		}
	}

}
