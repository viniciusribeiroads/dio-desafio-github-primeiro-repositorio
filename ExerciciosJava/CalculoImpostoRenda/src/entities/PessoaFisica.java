package entities;

public class PessoaFisica extends Pessoa{
	private Double gastosComSaude;
	
	public PessoaFisica() {
		
	}
	
	
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}
	
	



	public Double getGastosComSaude() {
		return gastosComSaude;
	}



	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}



	@Override
	public Double imposto() {
		if (this.RendaAnual < 20000.00) {
			if (this.gastosComSaude != 0) {
				return (this.RendaAnual * 0.15) - (gastosComSaude * 0.5);
			}
			else {
				return this.RendaAnual * 0.15;
			}
			
		}
		
		else {
			if (this.gastosComSaude != 0) {
				return (this.RendaAnual * 0.25) - (gastosComSaude * 0.5);
			}
			else {
				return this.RendaAnual * 0.25;
			}
	}
	}



	@Override
	public String toString() {
		StringBuilder strings = new StringBuilder();
		strings.append(String.format("%.2f",this.imposto()));
		return this.nome + " $ " + strings.toString();
	}
	
	

}
