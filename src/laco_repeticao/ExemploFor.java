package laco_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		int contador;
		
//		contador++ => contador = 0+1
		
		for(contador = 0; contador <=2; contador++) {
			System.out.println("Digite o " + (contador+1) + "º nome: ");
			nome = leia.nextLine();
			System.out.println("O " + (contador+1) + "º nome é: " + nome + "\n");

		}

		System.out.println("Sai do loop");
		
		leia.close();

	}

}
