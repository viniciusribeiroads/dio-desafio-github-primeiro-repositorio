package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.NumberOfContaComparator;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta c1 = new Conta(2403, 12, "Vinicius Salvador Ribeiro", 1800, 1000);
		Conta c2 = new Conta(3011, 20, "Otavio Matias Ribeiro", 1000, 500);
		Conta c3 = new Conta(3588, 8, "Maria joana", 2000, 300);
		Conta c4 = new Conta(3695, 55, "Juliana Patricia Ribeiro", 4000, 1000);
		Conta c5 = new Conta(2249, 98, "Paulo Silva Santos", 5000, 4000);
		
		List<Conta> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		for (Conta conta: list) {
			System.out.println(conta);
			}

		System.out.println("----------- Ordenado -----------------");
		
		//Ordenando a lista
		
		NumberOfContaComparator comparator = new NumberOfContaComparator();
		list.sort(comparator);
		
		for (Conta conta: list) {
			System.out.println(conta);
			}
		
	}

}
