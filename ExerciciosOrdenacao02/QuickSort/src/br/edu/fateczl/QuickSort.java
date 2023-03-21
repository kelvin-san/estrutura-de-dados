package br.edu.fateczl;

public class QuickSort {

	public QuickSort() {
		super();
	}
	
	public int[] quickSort(int[] vector, int start, int end) {
		if (end > start) {
			int pivot = dividirParaEncontrarPivo(vector, start, end);
			quickSort(vector, start, pivot - 1);
			quickSort(vector, pivot + 1, end);
		}
		
		return vector;
	}
	
	private int dividirParaEncontrarPivo(int[] vector, int start, int end) {
		int pivot = vector[start];
		int pointerL = start + 1;
		int pointerR = end;
		
		while (pointerL <= pointerR) {
			while (pointerL <= pointerR && vector[pointerL] <= pivot) {
				pointerL++;
			}
			while (pointerR >= pointerL && vector[pointerR] > pivot) {
				pointerR--;
			}
			if (pointerL < pointerR) {
				replace(vector, pointerL, pointerR);
				pointerL++;
				pointerR--;
			}
		}
		replace(vector, start, pointerR);
		
		int finalPivot = pointerR;
		
		return finalPivot;
	}
	
	private void replace(int[] vector, int n1, int n2) {
		int aux = vector[n1];
		vector[n1] = vector[n2];
		vector[n2] = aux;
	}

}
