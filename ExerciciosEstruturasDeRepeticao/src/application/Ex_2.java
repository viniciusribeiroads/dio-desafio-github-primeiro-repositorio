package application;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		/*
		Fa�a um programa que pe�a uma nota, entre zero e dez.
		Mostre uma mensagem caso o valor seja inv�lido
		e continue pedindo
		at� que o usu�rio informe um valor v�lido.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int nota;
		System.out.print("Digite uma nota entre 0 e 10: ");
		nota = sc.nextInt();
		
		while (nota > 10 || nota < 0) {
			System.out.println("Valor inv�lido! Tente novamente! ");
			System.out.print("Digite uma nota entre 0 e 10: ");
			nota = sc.nextInt();
		}
		
		
		System.out.println("Valor v�lido!");
		
	}
}
