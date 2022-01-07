package application;

import java.util.List;

public class Ex_1 {
	public static void main(String[] args) {
		/*
		Crie um vetor de 6 números inteiros
		e mostre-os na ordem inversa.
		*/
		
		//List <Integer> lista = new Arraylist<>();
		
		int[] vetor = {-5, -6, 15, 50, 8, 4};

		int count = vetor.length-1;
		
		while (count >= 0) {
			System.out.println(vetor[count]);
			count--;
		}
	}
}
