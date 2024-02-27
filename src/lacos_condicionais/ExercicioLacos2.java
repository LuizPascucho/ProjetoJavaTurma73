package lacos_condicionais;

import java.util.Scanner;

//---------EXERCÍCIO 2------------------------

public class ExercicioLacos2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		if(num%2==0 && num>=0) {
			System.out.println("O número " + num + " é par e positivo!");
		}
		else if(num%2!=0 && num <0) {
			System.out.println("O número " + num + " é impar e negativo!");
		}
		else if(num%2==0 && num <0) {
			System.out.println("O número " + num + " é par e negativo!");
		}
		else {
			System.out.println("O número " + num + " é impar e positivo!");
		}
		
		leia.close();
	}

}
