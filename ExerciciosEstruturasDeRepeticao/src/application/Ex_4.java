package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		
		/*
		Faça um programa que peça N números inteiros,
		calcule e mostre a quantidade de números pares
		e a quantidade de números impares.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int contador = 0;
		System.out.println("Quantos numeros vc deseja analisar: ");
		n = sc.nextInt();
		
		List <Integer> lista = new ArrayList<>();
		int value;
		
		while (contador < n) {
			System.out.print("Valor #" + (contador+1));
			value = sc.nextInt();
			
			lista.add(value);
			contador +=1;
		}
		
		int pares = 0;
		int impares = 0;
		for (Integer numero : lista) {
			if (numero%2 == 0) {
				pares +=1;
			}
			
			else {
				impares +=1;
			}
		}
		
		System.out.println("Quantidade de pares: " + pares);
		System.out.println("Quantidade de impares: " + impares);
	}

}
