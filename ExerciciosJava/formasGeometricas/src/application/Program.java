package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Retangle;

import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> lista = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" + i+1 + " data: " );
			System.out.print("Retangle ou Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next()); //A string que eu receber aqui sera convertido p variavel tipo Color
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				lista.add(new Retangle(color, width, height));
				
			}
			
			else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				lista.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		
		for (Shape shape : lista) {
			System.out.println(String.format("%.2f",shape.area())); //Usando mascara String.format para formatar valor
		}
		
		sc.close();
	}

}
