package application;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		/*
		Fa�a um programa que leia conjuntos de dois valores,
		o primeiro representando o nome do aluno e o segundo representando a sua idade.
		(Pare o programa inserindo o valor 0 no campo nome)
		*/
		
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		
		while (true) {
			System.out.println("Nome: ");
			nome = sc.next();
			if (nome.equals("0")) {
				break;
			}
			
			System.out.print("Idade: ");
			idade = sc.nextInt();
			
			
			
		}
		
		System.out.printf("%s - ", nome);
		
	}

}
