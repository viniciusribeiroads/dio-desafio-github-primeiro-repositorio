package application;

import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo
		 * usuário. Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Fatorial: ");
		int fatorial = sc.nextInt();
		
		System.out.print(fatorial+"! = ");
		int multiplicacao = 1;
		for (int i = fatorial; i >= 1; i--) {
			multiplicacao *= i;
		}
		
		System.out.print(multiplicacao);
	}

}
