package exerciciosmodulo7;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float n1;
		float n2;
		float n3;
		float n4;
		float diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o n1: ");
		n1 = leia.nextFloat();
	
		System.out.println("Digite o n2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o n3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o n4: ");
		n4 = leia.nextFloat();
		
		leia.close();
		
		diferenca = (n1*n2)-(n3*n4);
		
		System.out.println("A diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é: " + diferenca);
		
	}

}
