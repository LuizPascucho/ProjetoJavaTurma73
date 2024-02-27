package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
//		int idade;
//		boolean carteiraM;
//		
//		System.out.println("Digite a sua idade: ");
//		idade = leia.nextInt();
//		
//		System.out.println("Você tem carteira de habilitação? (True/false) ");
//		carteiraM = leia.nextBoolean();
//		
//		leia.close();
//		
//		if(idade>=18 && carteiraM==true) {
//			System.out.println("Pode dirigir");
//		}	
//		
//		else {
//			System.out.println("Não pode dirigir");
//		}
		
//		else if (idade>18 && carteiraM==false)
//		else if(idade<<18 && carteiraM==true)				
//		Não é necessário, pois o else já satisfaz estas condições.	
				
		
//------------------exemplo2----------------------------------
		
		
//		media para passar de ano é 6		
//		entre 5 é exame
//		menor que isso é reprovada		
		
		
		float nota1, nota2, media;
		
		System.out.println("digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		media = (nota1+nota2)/2;
		
		System.out.println("Sua média é: " + media);
		
		if (media>=6) {
			System.out.println("Parabéns, aprovado!");
		}
		else if (media>=5) {
			System.out.println("Está de exame");
		}
		else {
			System.out.println("Está reprovado!");
		}
		
		
		leia.close();
		
	}

}
