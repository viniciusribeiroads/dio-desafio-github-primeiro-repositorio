package application;

import entiites.Account;
import entiites.BusinessAccount;
import entiites.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		//Lembrar do termo "? um", conta empresarial ? uma conta
		Account acc1 = bacc; //Rolou um UPCASTING, atribuir valor da subclasse para um obj da super
		
		//Uma conta empresarial ? UMA CONTA entao nao da erro, rola o UPCASTING
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		//UPCASTING ? pegar um objeto da subclasse e atribuir para um objeto da super classe
		Account acc3 = new BusinessAccount(1004, "Anna", 0.0, 0.01);
		
		
		//DOWNCASTING
		//Erro incompatibilidade de tipo, precisamos for?ar a conversao
		//BusinessAccount acc4 = acc2;
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		
		//Nao e possivel, pois acc3 e uma SavingAccounts que herda de Accounts, mas nao herda
		//de BusinessAccount
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		//Vamos testar se ? do tipo BusinessAccount, se for faremos a convers?o
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
			
		}
		
		System.out.println("Saque com a BusinessAccount: ");
		Account acc5 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc5.withdraw(900.0);
		System.out.println("Saldo: ");
		System.out.println(acc5.getBalance());
		
		

	}

}
