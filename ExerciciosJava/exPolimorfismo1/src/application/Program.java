package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//mascara da data
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		List <Product> lista = new ArrayList<>();
		
		for (int i =0; i<n; i++) {
			System.out.println("Product #" + (i+1) +" data:");
			System.out.print("Commom, used or imported (c/u/i)?");
			String typeProduct = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (typeProduct.equals("c")) {
				Product p1 = new Product(name, price);
				lista.add(p1);
			}
			
			else if (typeProduct.equals("i")){
				System.out.print("Customs fee: ");
				Double customFee = sc.nextDouble();
				ImportedProduct p1 = new ImportedProduct(name, price, customFee);
				lista.add(p1);
			}
			
			else {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dataRecebida = sc.next();
				Date dataFormatada = formato.parse(dataRecebida); 
				UsedProduct p1 = new UsedProduct(name, price, dataFormatada);
				lista.add(p1);
			}
			
			
			
		}
		
		for (Product p : lista) {
			System.out.print(p.priceTag());
			System.out.println();
		}

	}

}
