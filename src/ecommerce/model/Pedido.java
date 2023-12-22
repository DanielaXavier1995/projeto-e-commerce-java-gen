package ecommerce.model;

import java.time.LocalDate;
import java.util.List;

public class Pedido extends Carrinho {
	
	private int numero;
	private LocalDate dataAbertura;
	
	public Pedido(List<Produto> produtoList) {
		super(produtoList);
	}

	public Pedido(List<Produto> produtoList, int numero, LocalDate dataAbertura) {
		super(produtoList);
		this.numero = numero;
		this.dataAbertura = dataAbertura;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = gerarNumero(0);
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = LocalDate.now();
	}
	
	public int gerarNumero(int numero) {
		return ++numero;
	}

	@Override
	public void vizualizarProduto() {
		super.vizualizarProduto();
		System.out.println("*************************************************");
		System.out.println("                      PEDIDO                     ");
		System.out.println("*************************************************");
		System.out.println("Numero: " + this.numero + "                      ");
		System.out.println("*************************************************");
		System.out.println("Código: " + this.dataAbertura + "                ");
	}
}
