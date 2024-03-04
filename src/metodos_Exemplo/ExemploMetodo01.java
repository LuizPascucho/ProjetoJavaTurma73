package metodos_Exemplo;

public class ExemploMetodo01 {

	public static void main(String[] args) {
		
		int resultado = somar(2,5);
		
		System.out.println("O primeiro resultado é: " + resultado);
		
		System.out.println("O segundo resultado é: " + somar(8,3));
		
		ExemploMetodo02.mensagem();
		ExemploMetodo02.saudacao("Oi, sei lá");
		
	}
	
	//CRIANDO MÉTODO SOMAR
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	

	
	
}
