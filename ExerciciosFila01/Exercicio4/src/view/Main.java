package view;

import javax.swing.JOptionPane;
import br.edu.fateczl.ObjectQueue;
import controller.CallingController;
import model.Client;

public class Main {

	public static void main(String[] args) {
		ObjectQueue priorityQueue = new ObjectQueue();
		ObjectQueue commonQueue = new ObjectQueue();
		int globalCounter = 1;
		CallingController ctrl = new CallingController();
		
		// Menu
		String opt = "";
		int optNumber = 0;
		Client c = new Client();
		do {
			opt = JOptionPane.showInputDialog("MENU\n\n1. Inserir cliente\n2. Chamar próximo cliente\n3. Visualizar tamanho das filas\n8. Gerar massa de dados aleatória\n9. Sair\n\n");
			try {
				optNumber = Integer.parseInt(opt);
				switch (optNumber) {
				case 1:
					c = new Client();
					
					String name = JOptionPane.showInputDialog("Insira o nome do cliente");
					c.setName(name);
					
					c.setNumber(globalCounter);
					globalCounter++;
					
					int type = 0;
					do {
						type = Integer.parseInt(JOptionPane.showInputDialog("A qual fila " + c.getName() + " pertence?\n\n1. Prioritária\n2. Comum\n\n"));
						if (type != 1 && type != 2) {
							JOptionPane.showMessageDialog(null, "Insira uma opção válida");
						}
					} while (type != 1 && type != 2);
					
					if (type == 1) {
						priorityQueue = ctrl.addClientToQueue(priorityQueue, c);
						JOptionPane.showMessageDialog(null, c.getName() + " foi adicionado a fila prioritária");
					} else {
						commonQueue = ctrl.addClientToQueue(commonQueue, c);
						JOptionPane.showMessageDialog(null, c.getName() + " foi adicionado a fila comum");
					}
					
					break;
					
				case 2:
					c = ctrl.callNextClient(priorityQueue, commonQueue);
					if (c != null) {
						JOptionPane.showMessageDialog(null, "CLIENTE\n\n[" + c.getNumber() + "] " + c.getName());						
					}
					break;
					
				case 3:
					ctrl.showQueuesSizes(priorityQueue, commonQueue);
					break;
					
				case 8:
					try {
						int size = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de clientes a serem gerados"));
						
						ObjectQueue[] q = ctrl.generateDataMass(size, priorityQueue, commonQueue);
						priorityQueue = q[0];
						commonQueue = q[1];
						
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Informe um valor do tipo numérico");
						
					}
					break;
					
				case 9:
					JOptionPane.showMessageDialog(null, "Sistema finalizado");
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
			}
			
			} catch (NumberFormatException e) {
				if (opt == null) {
					JOptionPane.showMessageDialog(null, "Sistema finalizado");
					optNumber = 9;
					
				} else {
					JOptionPane.showMessageDialog(null, "Opção inválida");
					
				}
				
			}
			
		} while (optNumber != 9);
		
	}
	
}
