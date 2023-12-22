package ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Carrinho{

    private List<Produto> produtoList;

	public Carrinho(List<Produto> produtoList) {
		super();
		this.produtoList = new ArrayList<Produto>();
	}

	public void adicionarProduto(Produto produto) {
        this.produtoList.add(produto);
    }
	
	public Produto buscarProduto(String codigo) {
        for (var p: produtoList) {
        	return p;
        }
        return null;
    }

    public void removerProduto(Produto produto) {
        this.produtoList.remove(produto);
    }
    
    public void vizualizarProduto() {
		
	    for (Produto p: produtoList) {
		System.out.println("*************************************************");
		System.out.println("               INFORMAÇÕES DO CARINHO            ");
		System.out.println("*************************************************");
		System.out.println("Nome: " + p.getNome() + "                        ");
		System.out.println("*************************************************");
		System.out.println("Código: " + p.getCodigo() + "                    ");
		System.out.println("*************************************************");
		System.out.println("Categoria: " + p.getCategoria() + "              ");
		System.out.println("*************************************************");
		System.out.println("Valor: " + p.getValor()+ "                       ");
		System.out.println("*************************************************");
	    }
    }
}
