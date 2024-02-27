package lacos_condicionais;

import java.util.Scanner;

//--------------EXERCÍCIO 5--------------------------

public class ExercicioLacos5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigo_item;
		int quantidade_item;

		System.out.println("Código do produto: ");
		codigo_item = leia.nextInt();
		
		System.out.println("Quantidade: ");
		quantidade_item = leia.nextInt();
		
		float cachorroquente = quantidade_item*10.00f;
		float xsalada = quantidade_item*15.00f;
		float xbacon = quantidade_item*18.00f;
		float bauru = quantidade_item*12.00f;
		float refrigerante = quantidade_item*8.00f;
		float sucodelaranja = quantidade_item*13.00f;
		
		switch(codigo_item) {
		case 1:
			System.out.println("Cachorro-quente");
			System.out.println("valor total: " + cachorroquente);
			break;
		case 2:
			System.out.println("X-Salada");
			System.out.println("valor total: " + xsalada);
			break;
		case 3:
			System.out.println("X-Bacon");
			System.out.println("valor total: " + xbacon);
			break;
		case 4:
			System.out.println("Bauru");
			System.out.println("valor total: " + bauru);
			break;
		case 5:
			System.out.println("Refrigerante");
			System.out.println("valor total: " + refrigerante);
			break;
		case 6:
			System.out.println("Suco de laranja");
			System.out.println("valor total: " + sucodelaranja);
			break;
		default:
			System.out.println("Opção invalida!");
			
		}
		
		leia.close();
	}

}
