package entities;

public class Conta {
	
	protected Integer number;
	protected Integer agencyNumber;
	protected String holder;
	protected Double balanceDouble;
	protected Double withdrawLimit;
	
	public Conta() {
		
	}

	public Conta(Integer number, Integer agencyNumber, String holder, double balanceDouble, double withdrawLimit) {
		this.number = number;
		this.agencyNumber = agencyNumber;
		this.holder = holder;
		this.balanceDouble = balanceDouble;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public Integer getAgencyNumber() {
		return agencyNumber;
	}


	public String getHolder() {
		return holder;
	}

	public Double getBalanceDouble() {
		return balanceDouble;
	}

	

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void withdraw(double balanceDouble) {
		this.balanceDouble = balanceDouble;
	}
	
	public void deposit(double balanceDouble) {
		this.balanceDouble += balanceDouble;
	}

	
	public String toString() {
		return "-----------------------------------------------------------------\n"
				+ "Agencia: "
				+ this.agencyNumber
				+"\nConta: "
				+ this.number
				+ " \nTitular: "
				+this.holder;
	}
	
	
	
	
	

}
