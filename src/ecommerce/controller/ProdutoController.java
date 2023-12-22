package ecommerce.controller;

import java.util.List;

import ecommerce.model.Pedido;
import ecommerce.model.Produto;
import ecommerce.repository.produtoRepository;

public class ProdutoController implements produtoRepository {

	private List<Produto> produtoList;

	int numero = 0;

	Pedido pedido = new Pedido(produtoList);

	@Override
	public void procurarPorCodigo(String codigo) {
		var produto = buscarNaCollection(codigo);

		if (produto != null) {
			produto.vizualizarProduto();
		} else {
			System.out.println("\nO produto não foi encontrado!");
		}
	}

	@Override
	public void listarTodos() {
		for (var produto : produtoList) {
			produto.vizualizarProduto();
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		produtoList.add(produto);
		System.out.println("\nO produto foi criado com sucesso!!");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscarProduto = buscarNaCollection(produto.getCodigo());

		if (buscarProduto != null) {
			produtoList.set(produtoList.indexOf(buscarProduto), produto);
			System.out.println("\nO produto foi atualizado com sucesso!");
		} else {
			System.out.println("\nO produto não foi encontrado!");
		}
	}

	@Override
	public void deletar(String codigo) {
		var produto = buscarNaCollection(codigo);
		
		if(produto != null) {
			if(produtoList.remove(produto) == true) {
            System.out.println("\nO produto foi deletado com sucesso!");
		}else {
			System.out.println("\nO produto não foi encontrado!");
		}
	  }
	}
	
	@Override
	public void inserir(String codigo) {

		var prod = buscarNaCollection(codigo);

		if (prod != null) {
			pedido.adicionarProduto(prod);
		} else {
			System.out.println("\nO produto não foi encontrado!");
		}
	}

	@Override
	public void remover(String codigo) {
		var prod = pedido.buscarProduto(codigo);

		if (prod != null) {
			    pedido.removerProduto(prod);
				System.out.println("\nO produto foi removido do carrinho!");
			} else {
				System.out.println("\nO produto não foi encontrado!");
			}
		}
	

	@Override
	public void mostrarPedido() {
		pedido.vizualizarProduto();
	}

	public Produto buscarNaCollection(String codigo) {
		for (var p : produtoList) {
			if (p.getCodigo().equalsIgnoreCase(codigo)) {
				return p;
			}
		}
		return null;
	}
}
