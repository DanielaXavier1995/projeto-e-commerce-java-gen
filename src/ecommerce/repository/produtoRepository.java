package ecommerce.repository;

import ecommerce.model.Produto;

public interface produtoRepository {
	
	public void procurarPorCodigo(String codigo);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(String codigoS);
	
	public void remover(int numero);
	public void inserir(int numero);
	public void mostrarPedido();

}
