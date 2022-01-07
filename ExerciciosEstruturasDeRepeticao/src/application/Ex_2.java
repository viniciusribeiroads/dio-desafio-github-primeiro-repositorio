package application;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		/*
		Faça um programa que peça uma nota, entre zero e dez.
		Mostre uma mensagem caso o valor seja inválido
		e continue pedindo
		até que o usuário informe um valor válido.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int nota;
		System.out.print("Digite uma nota entre 0 e 10: ");
		nota = sc.nextInt();
		
		while (nota > 10 || nota < 0) {
			System.out.println("Valor inválido! Tente novamente! ");
			System.out.print("Digite uma nota entre 0 e 10: ");
			nota = sc.nextInt();
		}
		
		
		System.out.println("Valor válido!");
		
	}
}
