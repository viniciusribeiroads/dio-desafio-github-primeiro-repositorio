package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex_3 {
	/*
	Faça um programa que leia 5 números
	e informe o maior número
	e a média desses números.
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		int sum = 0;
		List <Integer> lista = new ArrayList<>();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Numero #" + (i+1));
			numero = sc.nextInt();
			lista.add(numero);
		}
		
		for (Integer num : lista) {
			sum += num;
		}
		
		System.out.println("A media dos numeros é: " + (sum / 5));
		System.out.print("O maior numero digitado foi: " + Collections.max(lista));
		}
		
}


