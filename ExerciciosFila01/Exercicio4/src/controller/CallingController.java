package controller;

import javax.swing.JOptionPane;
import br.edu.fateczl.ObjectQueue;
import model.Client;

public class CallingController {
	
	private int priorityQueueCounter = 0;
	// Inserir na fila
	// Chamar próximo + regra de negócio
	
	public CallingController() {
		super();
	}
	
	public ObjectQueue addClientToQueue(ObjectQueue q, Client c) {
		q.insert(c);
		
		return q;
	}
	
	public Client callNextClient(ObjectQueue pQ, ObjectQueue cQ) {
		Client c = new Client();
		
		if (!pQ.isEmpty()) {
			if (priorityQueueCounter == 3) {
				// Fila comum
				c = getQueueElement(cQ);
				priorityQueueCounter = 0;
					
			} else {
				// Fila prioritária
				c = getQueueElement(pQ);
				priorityQueueCounter++;
					
			}
		} else if (!cQ.isEmpty()) {
			// Fila comum
			c = getQueueElement(cQ);
			
		} else {
			// Se as duas filas estiverem vazias
			JOptionPane.showMessageDialog(null, "Não há clientes a serem chamados");
			return null;
			
		}
		
		return c;
	}
	
	private Client getQueueElement(ObjectQueue q) {
		Client c = new Client();
		
		try {
			c = (Client) q.remove();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return c;
	}
	
	public void showQueuesSizes(ObjectQueue pQ, ObjectQueue cQ) {
		JOptionPane.showMessageDialog(null, "TAMANHO DAS FILAS\n\nTotal: " + (pQ.size() + cQ.size()) + "\nFila prioritária: " + pQ.size() + "\nFila comum: " + cQ.size());
		
	}
	
	public ObjectQueue[] generateDataMass(int size, ObjectQueue pQ, ObjectQueue cQ) {
		for (int i = 0; i < size; i++) {
			Client c = new Client();
			
			c.setName("Cliente " + (i + 1));
			c.setNumber(i + 1);
			
			int type = (int) (Math.random()*2); // 0-1
			
			if (type > 0) {
				pQ = addClientToQueue(pQ, c);
			} else {
				cQ = addClientToQueue(cQ, c);
			}
			
		}
		
		ObjectQueue[] auxQ = new ObjectQueue[2];
		auxQ[0] = pQ;
		auxQ[1] = cQ;
		
		JOptionPane.showMessageDialog(null, "Massa de dados gerada");
		
		return auxQ;
	}
	
}
