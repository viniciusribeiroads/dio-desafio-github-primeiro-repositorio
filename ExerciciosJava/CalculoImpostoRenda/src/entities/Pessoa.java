package entities;

public abstract class Pessoa {
	protected String nome;
	protected Double RendaAnual;
	
	public Pessoa() {
		
	}
	
	

	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		RendaAnual = rendaAnual;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return RendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		RendaAnual = rendaAnual;
	}
	
	public abstract Double imposto();
	
	
	
	

}
