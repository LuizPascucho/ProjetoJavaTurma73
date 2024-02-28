package laco_repeticao;

import java.util.Scanner;

//--------------EXERCÍCIO 3 WHILE----------------FEITO--------

public class ExercicioWhile3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int cont_menor_21 = 0;
		int cont_maior_50 = 0;
		
		while (idade >= 0) {
			System.out.println("Digite primeiro valor: ");
			idade = leia.nextInt();
		
			if(idade<21 && idade>0) {
				cont_menor_21++;
				
			}
			if(idade>50) {
				cont_maior_50++;
			}
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + cont_menor_21);
		System.out.println("Total de pessoas maiores de 50 anos: " + cont_maior_50);
		
		leia.close();
	}
}