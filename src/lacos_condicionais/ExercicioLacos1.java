package lacos_condicionais;

import java.util.Scanner;

//-----------EXERCÍCIO 1-----------------------

public class ExercicioLacos1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		if((a+b)>c) {
			System.out.println("A soma de A + B é maior do que C");
		}
		else if((a+b)==c) {
			System.out.println("A soma de A + B é igual do que C");
		}
		else {
			System.out.println("A soma de A + B é menor do que C");
		}
		
		leia.close();
	}

}
