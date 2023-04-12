package view;

import model.Client;
import br.edu.fateczl.filaobj.Fila;
import controller.OperationController;

public class Main {

	public static void main(String[] args) {
		
		Fila queue = new Fila();
		
		// Gerando clientes e populando fila
		for (int i = 0; i < 20; i++) {
			Client c = new Client();
			
			c.setName("Cliente " + (i+1));
			
			int qtt = (int) ((Math.random() * 31 ) + 20 ); // 20-50
			c.setQttItems(qtt);
			
			Double value = ((Math.random() * 96 ) + 5 ) ; // 5-100
			c.setItemValue(value);
			
			queue.insert(c);
		}
		
		OperationController op = new OperationController();
		op.calc(queue);
	}

}
