package entities;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public Conta(){
		
	}

	public Conta(double saldo, int agencia, int numero, Cliente titular) {
		super();
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}


	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular.getNome();
	}

	public void setTitular(String titular) {
		this.titular.setNome(titular); 
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.deposita(valor);
			return true;
		}
		
		else {
			return false;
		}
	}
	
	
	
}
