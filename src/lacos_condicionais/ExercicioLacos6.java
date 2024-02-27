package lacos_condicionais;

import java.util.Scanner;

//-----------EXERCÍCIO 6-----------------------------------

public class ExercicioLacos6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String colaborador;
		int cod_cargo;
		float salario;
		
		System.out.println("Nome do colaborador: ");
		colaborador = leia.nextLine();
		
		System.out.println("Cargo: ");
		cod_cargo = leia.nextInt();
		
		System.out.println("Salário: ");
		salario = leia.nextFloat();
		
		float novosalario1 = salario + (0.1f * salario);
		float novosalario2 = salario + (0.07f * salario);
		float novosalario3 = salario + (0.09f * salario);
		float novosalario4 = salario + (0.06f * salario);
		float novosalario5 = salario + (0.05f * salario);
		float novosalario6 = salario + (0.08f * salario);
		
		switch(cod_cargo) {
		case 1:
			System.out.println("Nome do colaborador: " + colaborador);
			System.out.println("Cargo: Gerente");
			System.out.println("Salário: " + novosalario1);
			break;
		case 2:
			System.out.println("Nome do colaborador: " + colaborador);
			System.out.println("Cargo: Vendedor");
			System.out.println("Salário: " + novosalario2);
			break;
		case 3:
			System.out.println("Nome do colaborador: " + colaborador);
			System.out.println("Cargo: Supervisor");
			System.out.println("Salário: " + novosalario3);
			break;
		case 4:
			System.out.println("Nome do colaborador: " + colaborador);
			System.out.println("Cargo: Motorista");
			System.out.println("Salário: " + novosalario4);
			break;
		case 5:
			System.out.println("Nome do colaborador: " + colaborador);
			System.out.println("Cargo: Estoquista");
			System.out.println("Salário: " + novosalario5);
			break;
		case 6:
			System.out.println("Nome do colaborador: " + colaborador);
			System.out.println("Cargo: Técnico de TI");
			System.out.println("Salário: " + novosalario6);
			break;
		default:
			System.out.println("Opção invalida!");
		}
		
		leia.close();

	}

}