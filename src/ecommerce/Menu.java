package ecommerce;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ecommerce.controller.ProdutoController;
import ecommerce.model.Pedido;
import ecommerce.model.Produto;

public class Menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void cadastrar(ProdutoController produto) {

		System.out.print("Digite o nome do produto: ");
		String nome = leia.nextLine();
		System.out.print("Digite o código do produto: ");
		String codigo = leia.nextLine();
		System.out.print("Digite a categoria do produto: ");
		String categoria = leia.nextLine();
		System.out.print("Digite o valor do produto (R$): ");
		float valor = leia.nextFloat();
		leia.skip("\\R?");
	}

	public static void main(String[] args) {
		
		Produto p1 = new Produto("toalha", "123", "vestuario", 75f);
		
		ProdutoController produtos = new ProdutoController();
//		
//		ArrayList<Produto> produtos = new ArrayList<Produto>();
//		produtos.add(p1);
//		
//		Pedido pedido = new Pedido(produtos, "222", LocalDate.of(2023, 12, 22));
//		
//		pedido.vizualizarProduto();

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
			System.out.println("            6 - Retirar produto do Carrinho          ");
			System.out.println("            7 - Inserir produto  do Carrinho         ");
			System.out.println("            8 - Mostrar Pedido                       ");
			System.out.println("            9 - Sair                                 ");
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

			if (opcao == 9) {
				System.out.println("\nMercado Gen - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\n       Cadastrar Produto      \n");
                cadastrar(produtos);
				keyPress();
				break;
			case 2:
				System.out.println("\n   Listar todos os Produtos  \n");
                produtos.listarTodos();
				keyPress();
				break;
			case 3:
				System.out.println("\n Buscar produto por Código \n");
				System.out.print("Digite o Código do produto: ");

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
				System.out.println("\n       Retirar produto  do Carrinho       \n");

				System.out.print("Digite o número do Produto: ");
				numero = leia.nextInt();

				keyPress();
				break;
			case 7:
				System.out.println("\n      Repor produto  do Carrinho      \n");

				System.out.print("Digite o número do Produto: ");
				numero = leia.nextInt();

				keyPress();
				break;
			
			case 8:
				System.out.println("\n      Mostrar Pedido      \n");

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
