package exerciciosmodulo7;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario;
		float abono;
		float novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
		leia.close();
		
		novosalario = salario+abono;
		
		System.out.println("Seu Novo Salário é: " + novosalario);
		
	}

}