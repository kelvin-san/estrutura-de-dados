package view;

import br.edu.fateczl.QuickSort;

public class Main {

	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		
		// Exercício 4
		int[] vet = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		int vetLength = vet.length;
		
		vet = sort.quickSort(vet, 0, vetLength-1);
		for (int i : vet) {
			System.out.print(i + " ");
		}

	}
}
