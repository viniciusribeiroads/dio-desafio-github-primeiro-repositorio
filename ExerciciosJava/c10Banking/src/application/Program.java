package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.NumberOfContaComparator;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta c1 = new Conta(2403, 12, "Vinicius Ribeiro", 1800, 1000);
		Conta c2 = new Conta(3011, 20, "Otavio Matias", 1000, 500);
		Conta c3 = new Conta(3588, 8, "Maria joana", 2000, 300);
		Conta c4 = new Conta(3695, 55, "Arnaldo Santos Xisto", 4000, 1000);
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
		
		
		//Comparando agora os nomes e ordenando por nome
		System.out.println("COMPARANDO POR NOME DO TITULAR EM ORDEM ALFABETICA");
		System.out.println();
		System.out.println();
		
		list.sort(new Comparator<Conta>() {
			
			@Override
			public int compare(Conta c1, Conta c2) { //Classe anonima comparando os titulares e colocando ordem alfabetica
				String nomeC1 = c1.getHolder();
				String nomeC2 = c2.getHolder();
				return nomeC1.compareTo(nomeC2);
				
			}
			
		});
		
		for (Conta conta: list) {
			System.out.println(conta);
			}
		
		
	}

}
