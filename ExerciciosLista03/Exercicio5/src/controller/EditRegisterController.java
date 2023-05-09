package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import model.Client;
import br.edu.fateczl.ObjectList;

public class EditRegisterController {

	public EditRegisterController() {
		super();
	}

	private void newFile(ObjectList l, String fileName) throws Exception {
		File file = new File("C:\\temp\\" + fileName);
		
		Boolean fileExists = false;
		if (file.exists() && file.isFile()) {
			fileExists = true;
		}

		int lSize = l.size();
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("CPF;Nome;Idade;LimiteCredito\n");

		for (int i = 0; i < lSize; i++) {
			Client c = (Client) l.get(i);

			sBuffer.append(c.getCpf() + ";");
			sBuffer.append(c.getName() + ";");
			sBuffer.append(c.getAge() + ";");
			sBuffer.append(c.getCreditLimit() + ";");
			sBuffer.append("\n");
		}

		FileWriter openFile = new FileWriter(file, fileExists);
		PrintWriter writeFile = new PrintWriter(openFile);
		writeFile.write(sBuffer.toString());
		writeFile.flush();
		writeFile.close();
		openFile.close();
	}

	public void newRegister(int minAge, int maxAge, Double creditLimit) throws Exception {
		ObjectList l = new ObjectList();
		ObjectList lFiltered = new ObjectList();
		Client c = new Client();
		
		try {
			BufferedReader buffer = readFile("cadastro.csv");
			String line = buffer.readLine(); // Eliminando linha de cabeçalho
			
			line = buffer.readLine();
			while (line != null) {
				String lineData[] = line.split(";");
				
				c.setCpf(lineData[0]);
				c.setName(lineData[1]);
				c.setAge(Integer.parseInt(lineData[2]));
				c.setCreditLimit(Double.parseDouble(lineData[3]));
				
				l.addLast(c);
				
				line = buffer.readLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		int lSize = l.size();
		int age;
		Double clientCreditLimit;
		for (int i = 0; i < lSize; i++) {
			c = (Client) l.get(i);
			age = c.getAge();
			clientCreditLimit = c.getCreditLimit();
			
			if (age >= minAge &&
				age <= maxAge &&
				clientCreditLimit > creditLimit) {
				
				lFiltered.addLast(c);
			}
		}
		
		String fileName = "Idade(" + minAge + "-" + maxAge + ")_Limite(" + creditLimit + ").csv";
		newFile(lFiltered, fileName);
	}
	
	private BufferedReader readFile(String fileName) throws IOException, Exception {
		File file = new File("C:\\temp\\" + fileName);
		if (file.exists() && file.isFile()) {
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			
			return buffer;
		} else {
			throw new Exception("File not found");
		}
	}
}
