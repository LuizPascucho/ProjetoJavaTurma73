package vetor_matriz;
import java.util.Scanner;

//------------------------EXERCÍCIO 3 MATRIZ---------------------

public class ExerciciosMatriz3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int coluna;
		int linha;
		int somadiagonalprincipal = 0;
		int somadiagonalsecundario = 0;
		
		for (linha = 0; linha < 3; linha++) {
			
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
				matriz[linha][coluna] = leia.nextInt();
			}
			
			//DIAGONAL PRINCIPAL
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if(linha==coluna) {
						System.out.println("elementos da diagonal é: " + matriz[linha][coluna]);
					}
					
				}
			}
			
//			//DIAGONAL SECUNDÁRIO
//			else if (linha == 0 && coluna == 2 && linha == 1 && coluna == 1 && linha == 2 && coluna == 0) {
//				System.out.println("Elementos da diagonal secundário" + matriz[linha] + "e" + matriz[coluna]);
//			
//			}
//			
//			//SOMA DA DIAGONAL PRINCIPAL
//			else if(linha == 0 && coluna == 0 && linha == 1 && coluna == 1 && linha == 2 && coluna == 2) {
//				somadiagonalprincipal=linha+coluna;
//				System.out.println("soma da diagonal principal" + somadiagonalprincipal);
//			}
//			
//			//SOMA DA DIAGONAL SECUNDÁRIO
//			else if (linha == 0 && coluna == 2 && linha == 1 && coluna == 1 && linha == 2 && coluna == 0) {
//				somadiagonalsecundario = linha+coluna;
//				System.out.println("Elementos da diagonal secundário" + somadiagonalsecundario);
			}
		}	
	}
//}
