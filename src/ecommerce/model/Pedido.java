package ecommerce.model;

import java.time.LocalDate;
import java.util.List;

public class Pedido extends Carrinho {
	
//	private int numero;
//	private LocalDate dataAbertura;
	
	public Pedido(List<Produto> produtoList) {
		super(produtoList);
	}

//	public Pedido(List<Produto> produtoList, int numero, LocalDate dataAbertura) {
//		super(produtoList);
//		this.numero = numero;
//		this.dataAbertura = dataAbertura;
//	}
	
	public int gerarNumero(int numero) {
		return ++numero;
	}

	@Override
	public void vizualizarProduto() {
		super.vizualizarProduto();
		System.out.println("*************************************************");
		System.out.println("                      PEDIDO                     ");
		System.out.println("*************************************************");
		System.out.println("Numero: " + gerarNumero(0) + "                   ");
		System.out.println("*************************************************");
		System.out.println("Data: " + LocalDate.now() + "                    ");
		System.out.println("*************************************************");
		System.out.println("Total da compra: " + valorTotalCarrinho(0) + "   ");
	}
}
