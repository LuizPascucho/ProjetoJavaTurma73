package exerciciosmodulo7;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float salariobruto;
		float adicionalnoturno;
		float horasextras;
		float descontos;
		float salarioliquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu Sálario Bruto: ");
		salariobruto = leia.nextFloat();
		
		System.out.println("Digite seu Adicional Noturno: ");
		adicionalnoturno = leia.nextFloat();
		
		System.out.println("Digite suas Horas Extras: ");
		horasextras = leia.nextFloat();
		
		System.out.println("Digite seus Descontos: ");
		descontos = leia.nextFloat();
		
		leia.close();
	
		salarioliquido = salariobruto+adicionalnoturno+(horasextras*5)-descontos;
		
		System.out.println("Seu Salário Liquido é: " + salarioliquido);
		

	}

}
