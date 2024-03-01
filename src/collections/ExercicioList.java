//------------------EXERCICIO 2 LIST----------------------

package collections;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Integer selecionado;
		int indice = -1;

		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);
		
		System.out.println("Digite o número que deseja encontrar: ");
		selecionado = leia.nextInt();
	
			if(num.indexOf(selecionado) == indice) {
				System.out.println("O número " + selecionado + " não foi encontrado!");
			}	
			else {
		System.out.println("O número " + selecionado + " está localizado na posição: " + num.indexOf(selecionado));
			}
		}	
}