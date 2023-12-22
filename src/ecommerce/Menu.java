package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao = 0, numero;
		float valor;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     MERCADO GEN                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar produto por Numero            ");
			System.out.println("            4 - Atualizar Dados do produto           ");
			System.out.println("            5 - Apagar produto                       ");
			System.out.println("            6 - Retirar produto                      ");
			System.out.println("            7 - Repor produto                        ");
			System.out.println("            8 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.print("Entre com a opção desejada:                           ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 8) {
				System.out.println("\nMercado Gen - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\n       Cadastrar Produto      \n");

				keyPress();
				break;
			case 2:
				System.out.println("\n   Listar todos os Produtos  \n");

				keyPress();
				break;
			case 3:
				System.out.println("\n Buscar produto por Numero \n");
				System.out.print("Digite o número do Produto: ");

				keyPress();
				break;
			case 4:
				System.out.println("\n Atualizar Dados do produto \n");
				System.out.print("Digite o número do Produto: ");
				numero = leia.nextInt();

				keyPress();
				break;
			case 5:
				System.out.println("\n       Apagar produto       \n");
				System.out.print("Digite o número do Produto: ");
				numero = leia.nextInt();

				keyPress();
				break;
			case 6:
				System.out.println("\n       Retirar produto        \n");

				System.out.print("Digite o número do Produto: ");
				numero = leia.nextInt();

				keyPress();
				break;
			case 7:
				System.out.println("\n      Repor produto       \n");

				System.out.print("Digite o número do Produto: ");
				numero = leia.nextInt();

				keyPress();
				break;

			default:
				System.out.println("\nOpção Inválida");

				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Daniela Xavier");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
