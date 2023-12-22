package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.ProdutoController;
import ecommerce.model.Produto;

public class Menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void cadastrar(ProdutoController produto, String cod) {

		leia.skip("\\R?");
		System.out.print("\nDigite o nome do produto: ");
		String nome = leia.nextLine();
		System.out.print("\nDigite o código do produto: ");
		cod = leia.nextLine();
		System.out.print("\nDigite a categoria do produto: ");
		String categoria = leia.nextLine();
		System.out.print("\nDigite o valor do produto (R$): ");
		float valor = leia.nextFloat();
		leia.skip("\\R?");
		
		produto.cadastrar(new Produto(nome, cod, categoria, valor));
	}
	
        public static void atualizar(ProdutoController produto, String codigo) {
		
        	leia.skip("\\R?");
        	System.out.print("\nDigite o nome do produto: \n");
    		String nome = leia.nextLine();
    		System.out.print("\nDigite a categoria do produto: \n");
    		String categoria = leia.nextLine();
    		System.out.print("\nDigite o valor do produto (R$): \n");
    		float valor = leia.nextFloat();
    		leia.skip("\\R?");
    		
    		produto.atualizar(new Produto(nome, codigo, categoria, valor));
	}
        
        public static void criarProdutos(ProdutoController produto) {
        	Produto p1 = new Produto("Vestido", "111", "roupa", 200.0f);
        	Produto p2 = new Produto("Saia", "222", "roupa", 150.0f);
        	Produto p3 = new Produto("Calça", "333", "roupa", 300.0f);
        	Produto p4 = new Produto("Blusa", "444", "roupa", 100.0f);
        	Produto p5 = new Produto("sapatilha", "555", "sapato", 120.0f);
        	
        	produto.cadastrar(p1);
        	produto.cadastrar(p2);
        	produto.cadastrar(p3);
        	produto.cadastrar(p4);
        	produto.cadastrar(p5);
        }

	   public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController();
		
		criarProdutos(produtos);

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
			System.out.println("            3 - Buscar produto por código            ");
			System.out.println("            4 - Atualizar Dados do produto           ");
			System.out.println("            5 - Apagar produto                       ");
			System.out.println("            6 - Retirar produto do Carrinho          ");
			System.out.println("            7 - Inserir produto no Carrinho          ");
			System.out.println("            8 - Finalizar Pedido                     ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.print("Entre com a opção desejada:                            ");

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
				System.out.println("\n   ***    Cadastrar Produto   ***   \n");
                cadastrar(produtos, cod);
				keyPress();
				break;
			case 2:
				System.out.println("\n  ***  Listar todos os Produtos ***  \n");
                produtos.listarTodos();
				keyPress();
				break;
			case 3:
				System.out.println("\n *** Buscar produto por Código ***\n");
				leia.skip("\\R?");
				System.out.print("Digite o Código do produto: ");
				cod = leia.nextLine();
				
				produtos.procurarPorCodigo(cod);

				keyPress();
				break;
			case 4:
				System.out.println("\n *** Atualizar Dados do produto *** \n");
				System.out.print("Digite o Código do produto: ");
				cod = leia.nextLine();
				
                var buscarProduto = produtos.buscarNaCollection(cod);
				
				if(buscarProduto != null) {
					atualizar(produtos, cod);
				} else {
					System.out.println("Conta não encontrada!!");
				}
				
				keyPress();
				break;
			case 5:
				System.out.println("\n  ***  Apagar produto  *** \n");
				leia.skip("\\R?");
				System.out.print("Digite o Código do produto: ");
				cod = leia.nextLine();
				
				produtos.deletar(cod);

				keyPress();
				break;
			case 6:
				System.out.println("\n ***  Retirar produto  do Carrinho *** \n");
				leia.skip("\\R?");
				System.out.print("Digite o Código do produto: ");
				cod = leia.nextLine();

				produtos.remover(cod);
				
				keyPress();
				break;
			case 7:
				System.out.println("\n   ***  Inserir produto no Carrinho  ***   \n");
				leia.skip("\\R?");
				System.out.print("Digite o Código do produto: ");
				cod = leia.nextLine();
				
				produtos.inserir(cod);

				keyPress();
				break;
			
			case 8:
				System.out.println("\n   ***   Finalizar Pedido  ***  \n");
				
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
