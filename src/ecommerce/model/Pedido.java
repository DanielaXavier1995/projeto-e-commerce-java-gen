package ecommerce.model;

import java.time.LocalDate;
import java.util.List;

public class Pedido extends Carrinho {
	
	private String numero;
	private LocalDate dataAbertura;
	
	public Pedido(List<Produto> produtoList) {
		super(produtoList);
	}

	public Pedido(List<Produto> produtoList, String numero, LocalDate dataAbertura) {
		super(produtoList);
		this.numero = numero;
		this.dataAbertura = dataAbertura;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
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
