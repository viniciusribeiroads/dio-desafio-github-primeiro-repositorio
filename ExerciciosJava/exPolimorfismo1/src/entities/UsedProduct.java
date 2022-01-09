package entities;

import java.util.Date;

public class UsedProduct extends Product {
	private Date manufactureDate;

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		StringBuilder dadosFormatados = new StringBuilder();
		dadosFormatados.append(name);
		dadosFormatados.append(" (used) ");
		dadosFormatados.append("$ ");
		dadosFormatados.append(price);
		dadosFormatados.append("Manyfacture date: ");
		dadosFormatados.append(manufactureDate);
		
		return dadosFormatados.toString();
	}

}
