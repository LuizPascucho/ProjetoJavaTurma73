package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Criando a Collection ArrayList
		ArrayList<Double> notas = new ArrayList<Double>();
		
		Double numero;
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);

		System.out.println("\nNotas cadastradas: " + notas);
		
		System.out.println("Digite o número que você deseja procurar: ");
		numero = leia.nextDouble();

		System.out.println("\nA posição da nota 10 é: " + notas.indexOf(numero));
		
		
	}

}
