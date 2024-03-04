package collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int num;
		String nome;
		
		Queue<String> fila = new LinkedList<String>();
		
		System.out.println("1 - Adicionar cliente na fila");
		System.out.println("2 - Listar todos os clientes");
		System.out.println("3 - retirar cliente da fila");
		System.out.println("0 - Sair");
		System.out.println("************************************************");
		System.out.println("Entre com a opção desejada: ");
		
		num = leia.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("Digite o nome: ");
			nome = leia.next();
			fila.add(nome);
			
			System.out.println("Fila: " + fila + " Cliente Adicionado");
			break;
			
		case 2:
			System.out.println("Lista de clientes na fila: " + fila);
			break;
			
		case 3:
			if(fila.isEmpty()) {
				System.out.println("A fila está vazia!");
			}
			else {
			System.out.println("Fila:" + fila.remove() + " O cliente foi chamado");
			}
			break;
			
		case 0:
			System.out.println("Programa Finalizado!");
			break;
		}
	}
}