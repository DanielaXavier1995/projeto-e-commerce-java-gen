package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.ProdutoController;
import ecommerce.model.Produto;

public class Menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void cadastrar(ProdutoController produto, String cod) {

		System.out.print("Digite o nome do produto: ");
		String nome = leia.nextLine();
		System.out.print("Digite o código do produto: ");
		cod = leia.nextLine();
		System.out.print("Digite a categoria do produto: ");
		String categoria = leia.nextLine();
		System.out.print("Digite o valor do produto (R$): ");
		float valor = leia.nextFloat();
		leia.skip("\\R?");
		
		produto.cadastrar(new Produto(nome, cod, categoria, valor));
	}
	
        public static void atualizar(ProdutoController produto, String codigo) {
		
        	System.out.print("Digite o nome do produto: ");
    		String nome = leia.nextLine();
    		System.out.print("Digite a categoria do produto: ");
    		String categoria = leia.nextLine();
    		System.out.print("Digite o valor do produto (R$): ");
    		float valor = leia.nextFloat();
    		leia.skip("\\R?");
    		
    		produto.atualizar(new Produto(nome, codigo, categoria, valor));
	}

	   public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController();

		int opcao = 0;
		String cod = null;

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
			System.out.println("            7 - Inserir produto no Carrinho         ");
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
                cadastrar(produtos, cod);
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
				cod = leia.nextLine();
				
				produtos.procurarPorCodigo(cod);

				keyPress();
				break;
			case 4:
				System.out.println("\n Atualizar Dados do produto \n");
				System.out.print("Digite o Código do produto: ");
				cod = leia.nextLine();
				
				atualizar(produtos, cod);

				keyPress();
				break;
			case 5:
				System.out.println("\n       Apagar produto       \n");
				System.out.print("Digite o Código do produto: ");
				cod = leia.nextLine();
				
				produtos.deletar(cod);

				keyPress();
				break;
			case 6:
				System.out.println("\n       Retirar produto  do Carrinho       \n");

				System.out.print("Digite o Código do produto: ");
				cod = leia.nextLine();

				produtos.remover(cod);
				
				keyPress();
				break;
			case 7:
				System.out.println("\n      Inserir produto no Carrinho      \n");

				System.out.print("Digite o Código do produto: ");
				cod = leia.nextLine();
				
				produtos.inserir(cod);

				keyPress();
				break;
			
			case 8:
				System.out.println("\n      Mostrar Pedido      \n");

				System.out.print("Digite o Código do produto: ");
				cod = leia.nextLine();
				
				produtos.mostrarPedido();

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
