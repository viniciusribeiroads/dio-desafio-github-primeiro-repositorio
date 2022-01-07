package application;

import java.util.Locale;

import entities.Cliente;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Cliente paulo = new Cliente("Paulo Silveira", "2222222222", "Programador");
		Cliente vinicius = new Cliente("Vinicius Salvador Ribeiro", "11610985805", "Estagiario");
		
		Conta primeiraConta = new Conta(1200.00, 2483, 7202, paulo);
		Conta contaDoPaulo = new Conta(0.00, 2483, 7202, paulo);

		System.out.println(String.format("R$ %.2f", primeiraConta.getSaldo()));
		primeiraConta.deposita(1000);
		System.out.println(String.format("R$ %.2f", primeiraConta.getSaldo()));
		primeiraConta.saca(1000);
		System.out.println(String.format("R$ %.2f", primeiraConta.getSaldo()));
		primeiraConta.transfere(1200, contaDoPaulo);
		System.out.println(String.format("R$ %.2f", primeiraConta.getSaldo()));
		System.out.println(String.format("R$ %.2f", contaDoPaulo.getSaldo()));

	}

}
