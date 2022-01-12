package entities;

public class Circle extends Shape {

	private Double radius;
	
	public Circle() {
		
	}
	
	
	public Circle(entities.enums.Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	


	public Double getRadius() {
		return radius;
	}


	public void setRadius(Double radius) {
		this.radius = radius;
	}


	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

}
