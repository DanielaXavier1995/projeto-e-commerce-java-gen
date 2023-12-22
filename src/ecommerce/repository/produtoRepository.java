package ecommerce.repository;

import ecommerce.model.Produto;

public interface produtoRepository {
	
	public void procurarPorCodigo(String codigo);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(String codigo);
	
	public void remover(String codigo);
	public void inserir(String codigo);
	public void mostrarPedido();

}
