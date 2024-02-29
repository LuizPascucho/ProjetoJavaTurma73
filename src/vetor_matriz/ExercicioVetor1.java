package vetor_matriz;
import java.util.Scanner;

//-----------------------EXERCICIO 1 VETOR----------------------------FEITO

public class ExercicioVetor1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int vetor[] = new int[10];
		int i;
		int num;
		int resultado = -1;

		for (i = 0; i < vetor.length; i++) {

			System.out.println("Digite o " + (i + 1) + "º valor: ");
			vetor[i] = leia.nextInt();
		}

		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();

		for (i = 0; i < vetor.length; i++) {

			if (vetor[i] == num) {
				resultado = i;
			}
		}
		if (resultado >= 0) {

			System.out.println("O número " + num + " está localizado na posição: " + resultado);

		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}
	}
}