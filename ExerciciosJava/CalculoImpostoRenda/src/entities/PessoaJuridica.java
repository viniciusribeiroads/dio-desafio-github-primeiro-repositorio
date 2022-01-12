package entities;

public class PessoaJuridica extends Pessoa {
	
	private int NumeroFuncionarios;
	
	public PessoaJuridica() {
		
	}
	
	

	public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		NumeroFuncionarios = numeroFuncionarios;
	}
	
	



	public int getNumeroFuncionarios() {
		return NumeroFuncionarios;
	}



	public void setNumeroFuncionarios(int numeroFuncionarios) {
		NumeroFuncionarios = numeroFuncionarios;
	}



	@Override
	public Double imposto() {
		if (this.NumeroFuncionarios > 10) {
			return RendaAnual * 0.14;
		}
		
		else {
			return RendaAnual * 0.16;
		}
		
	}
	
	@Override
	public String toString() {
		StringBuilder strings = new StringBuilder();
		strings.append(String.format("%.2f",this.imposto()));
		return this.nome + " $ " + strings.toString();
	}
	
	
}
