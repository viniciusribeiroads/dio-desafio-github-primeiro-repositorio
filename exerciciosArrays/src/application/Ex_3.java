package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_3 {
	public static void main(String[] args) {
		/*
		Fa�a um Programa que leia 20 n�meros inteiros aleat�rios (entre 0 e 100) armazene-os num vetor.
		Ao final mostre os n�meros e seus sucessores.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		List <Integer> lista = new ArrayList<>();
		int numero;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um valor: ");
			numero = sc.nextInt();
			lista.add(numero);
		}
		
		for (Integer num : lista) {
			System.out.print(num + " -> " + (num + 1) +"\n");
			
		}
		
	}
}
