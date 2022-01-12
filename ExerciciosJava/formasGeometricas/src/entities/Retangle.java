package entities;

import entities.enums.Color;

public class Retangle extends Shape {

	private Double width;
	private Double height;
	
	public Retangle() {
		super();
	}
	
	public Retangle (Color color, Double width, Double height) {
		super(color);
		this.height = height;
		this.width = width;
		
	}
	
	
	
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

}
