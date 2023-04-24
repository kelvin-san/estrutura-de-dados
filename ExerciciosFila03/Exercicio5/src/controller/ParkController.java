package controller;

import model.Pessoa;
import br.edu.fateczl.filaobj.Fila;

public class ParkController {

	public ParkController() {
		super();
	}
	
	public void calc(Fila q) {
		int qSize = q.size();
		
		System.out.println("NOME\t\t\tCONDICAO\n");
		try {
			for (int i = 0; i < qSize; i++) {
				Pessoa p;
				p = (Pessoa) q.remove();
			
				String name = p.getName();
				int age = p.getAge();
				Double height = p.getHeight();
				
				if (age > 16 && height > 1.6) {
					System.out.println(name + "\t\t" + "Entrou");					
				} else {
					System.out.println(name + "\t\t" + "Nao pode entrar");
				}
				
			}
			
		} catch (Exception e) {
			System.err.println("A fila nao esta corretamente populada;");
			
		}
	}
}
