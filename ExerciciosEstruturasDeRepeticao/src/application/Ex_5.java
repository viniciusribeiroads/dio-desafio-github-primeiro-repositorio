package application;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		/*
		Desenvolva um gerador de tabuada,
		capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
		O usuário deve informar de qual numero ele deseja ver a tabuada.
		A saída deve ser conforme o exemplo abaixo:

		Tabuada de 5:
		5 X 1 = 5
		5 X 2 = 10
		...
		5 X 10 = 50
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tabuada Em Java");
		System.out.print("Qual numero você deseja ver a tabuada: ");
		int numero = sc.nextInt();
		
		for (int valor = 0; valor <= 10; valor ++) {
			System.out.println(numero + " x " + valor + " = " + (numero * valor));
		}
		
		

	}

}
