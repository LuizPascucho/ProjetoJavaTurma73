package exerciciosmodulo7;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float mediafinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite sua nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite sua nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite sua nota 4: ");
		nota4 = leia.nextFloat();
		
		leia.close();

		mediafinal = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("Sua Média Final é: %.1f" , mediafinal);
		
	}

}
