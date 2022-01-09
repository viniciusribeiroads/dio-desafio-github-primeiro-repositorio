package entities;

public class ImportedProduct extends Product {
	private Double customFee;
	

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder dadosFormatados = new StringBuilder();
		dadosFormatados.append(name);
		dadosFormatados.append(" $ ");
		dadosFormatados.append(totalPrice());
		dadosFormatados.append(" (Customs fee: $ ");
		dadosFormatados.append(getCustomFee());
		dadosFormatados.append(")");
		
		return dadosFormatados.toString();
	}
	
	public double totalPrice() {
		return this.price+this.customFee;
	}
	
	
}
