package laco_repeticao;

import java.util.Scanner;

//----------------EXERCÍCIO 5 DO WHILE------------FEITO---------------

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		int soma = 0;
		int cont = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if(num>=0) {
				soma = num+soma;
				cont++;
			}
			
		} while (num != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
		leia.close();
	}
}