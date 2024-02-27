package exerciciosmodulo7;

import java.util.Scanner;

public class ExercicioComplementar2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio;
		double area;
		
		System.out.println("Raio: ");
		raio = leia.nextDouble();
		
		leia.close();
		
		area = pi*(raio*raio);
		
		System.out.printf("Area: %.4f" , area);
		

	}

}
