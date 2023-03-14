package br.edu.fateczl.sortMethods;

public class Sort {

	public Sort() {
		super();
	}
	
	// Retorna o vetor recebido ordenado por bubble sort
	public int[] bubbleSort(int[] vector) {
		int vectorLength = vector.length;
		int aux;
		
		for (int i = 0; i < vectorLength; i++) {
			for (int j = i+1; j < vectorLength-1; j++) {
				if (vector[j] < vector[i]) {
					aux = vector[j];
					vector[j] = vector[i];
					vector[i] = aux;
				}
			}
		}
		
		return vector;
	}
	
	// Retorna o vetor recebido ordenado por merge sort
	public int[] mergeSort(int[] vector, int start, int end) {
		if (start < end) {
			int mid = (int) (start + end) / 2;
			mergeSort(vector, start, mid);
			mergeSort(vector,  mid+1, end);
			merge(vector, start, mid, end);
		}
		
		return vector;
	}
	
	// Intercala 2 subvetores provenientes do método merge sort
	private void merge(int[] vector, int start, int mid, int end) {
		int vectorLength = vector.length;
		int[] vAux = new int[vectorLength];
		
		for (int i = 0; i < vectorLength; i++) {
			vAux[i] = vector[i];
		}
		
		int i = start;
		int j = mid+1;
		
		for(int n = start; n < end; n++) {
			if (i > mid) {
				vector[n] = vAux[j];
				j++;
			} else if (j > end) {
				vector[n] = vAux[i];
				i++;
			} else if (vAux[i] < vAux[j]){
				vector[n] = vAux[i];
				i++;
			} else {
				vector[n] = vAux[j];
				j++;
			}
		}
		
	}

}
