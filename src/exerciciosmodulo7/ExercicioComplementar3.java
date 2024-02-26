package exerciciosmodulo7;

import java.util.Scanner;

public class ExercicioComplementar3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos;
		int horas = 3600;
		int minutos = 60;
		
		System.out.println("Digite a duração em segundos: ");
		segundos = leia.nextInt();
		
		leia.close();
		
		horas = segundos/horas;
		segundos %=3600;
		
		minutos = segundos/minutos;
		segundos %=60;
		
		System.out.println("O tempo em hora:minuto:segundo é: " + horas + ":" + minutos + ":" + segundos);
		
	}

}
