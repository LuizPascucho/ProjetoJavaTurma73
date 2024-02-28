package laco_repeticao;

import java.util.Scanner;

//------------EXERCÍCIO 1 FOR-----------------------------  FEITO-------

public class ExercicioFor1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		int contador;
		int contpar = 0;
		int contimpar= 0;
		
		for(contador = 1; contador<=10; contador++) {
			
			System.out.println("Digite o " + contador + " º número: ");
			num = leia.nextInt();
				
			if(num%2==0) {
				contpar++;
			}
			
			if(num%2!=0) {
				contimpar++;
			}
			
		}
		
		System.out.println("Total de números pares: " + contpar);
		System.out.println("Total de números impares: " + contimpar);	
		
		leia.close();
	}
}