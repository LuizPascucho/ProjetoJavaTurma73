package exerciciosmodulo7;

import java.util.Scanner;

public class ExercicioComplementar1 {

	public static void main(String[] args) {
		
		int valor_a;
		int valor_b;
		int soma;
		int diferenca;
		int multiplicacao;
		int divisao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		valor_a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		valor_b = leia.nextInt();
		
		leia.close();
		
		soma = valor_a + valor_b;
		diferenca = valor_a - valor_b;
		multiplicacao = valor_a*valor_b;
		divisao = valor_a/valor_b;
		
		System.out.println("A soma de A e B é: " + soma);
		System.out.println("A Diferença de A e B é: " + diferenca);
		System.out.println("A Multiplicação de A e B é: " + multiplicacao);
		System.out.println("A Divisão de A e B é: " + divisao);

	}

}
