package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		

		List<Product> list = new ArrayList<>();
		
		String path = "C:\\testeArquivo\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				//Recebendo a linha, cortando nas virgulas
				String [] fields = line.split(",");
				//Instanciando os objetos
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Max:");
			System.out.println(x);
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		

	}

}
