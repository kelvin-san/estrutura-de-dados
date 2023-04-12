package view;

import model.Pessoa;
import br.edu.fateczl.filaobj.Fila;
import controller.ParkController;

public class Main {

	public static void main(String[] args) {
		
		Fila queue = new Fila();
		
		// Gerando pessoas e populando fila
		for (int i = 0; i < 30; i++) {
			Pessoa p = new Pessoa();
			
			p.setName("Pessoa " + (i+1));
			
			int age = (int) ((Math.random() * 31 ) + 10 ); // 10-40
			p.setAge(age);
			
			Double height = ((Math.random() * 0.66 ) + 1.35 ) ; // 1.35-2.00
			p.setHeight(height);
			
			queue.insert(p);
		}
		
		ParkController op = new ParkController();
		op.calc(queue);
	}

}
