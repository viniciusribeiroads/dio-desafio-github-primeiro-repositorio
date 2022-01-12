package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int numero = sc.nextInt();
		
		for (int i=1; i<=numero; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			if (ch == 'i') {
				System.out.print("Name");
				String name = sc.next();
				System.out.print("Anual income: ");
				double rendimentoAnual = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				lista.add(new PessoaFisica(name, rendimentoAnual, gastosSaude));
			}
			
			else if (ch == 'c') {
				
				System.out.print("Name");
				String name = sc.next();
				System.out.print("Anual income: ");
				double rendimentoAnual = sc.nextDouble();
				System.out.print("Numer of employees: ");
				int numFunc = sc.nextInt();
				lista.add(new PessoaJuridica(name, rendimentoAnual, numFunc));
				
			}
			
			else {
				System.out.println("Invalid! ");
			}
		} //fim do for
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double total = 0;
		for (Pessoa people : lista) {
			System.out.println(people.toString());
			total += people.imposto();
		}
		
		System.out.printf("TOTAL TAXES: $ %.2f", total );
		

	}

}
