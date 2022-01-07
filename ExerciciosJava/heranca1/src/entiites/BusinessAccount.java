package entiites;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
		
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			deposit(amount);
		}
	}
	
	//Operador de sobreposição aproveitando a lógica da superclasse e implementando-a.
		@Override
		public void withdraw(double amount) {
			super.withdraw(amount);
			balance -= 2.0;
		}
		
		
	
	
}
