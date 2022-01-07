package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes
		 * foram lidas. Imprima as consoantes.
		 */

		Scanner sc = new Scanner(System.in);

		String letraLida;
		List<String> lista = new ArrayList<>();
		int quantidadeConsoantes = 0;

		for (int i = 0; i < 6; i++) {
			System.out.print("Digite uma letra: ");
			letraLida = sc.next();

			if (!(letraLida.equalsIgnoreCase("a") | letraLida.equalsIgnoreCase("e") | letraLida.equalsIgnoreCase("i")
					| letraLida.equalsIgnoreCase("o") | letraLida.equalsIgnoreCase("u"))) {
				lista.add(letraLida);
				quantidadeConsoantes++;

			}
		}
		
		for (String letra : lista) {
			System.out.println(letra);
		}
		System.out.println("Voce digitou " + quantidadeConsoantes + " consoantes.");
	}

}
