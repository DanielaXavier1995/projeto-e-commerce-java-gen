package ecommerce.model;

public class Produto {
	
	private String nome;
	private String codigo;
	private String categoria;
	private float valor;

	public Produto(String nome, String codigo, String categoria, float valor) {
		this.nome = nome;
		this.codigo = codigo;
		this.categoria = categoria;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
public void vizualizarProduto() {
	
		System.out.println("*************************************************");
		System.out.println("               INFORMAÇÕES DO CARINHO            ");
		System.out.println("*************************************************");
		System.out.println("Nome: " + this.nome + "                        ");
		System.out.println("*************************************************");
		System.out.println("Código: " + this.codigo + "                    ");
		System.out.println("*************************************************");
		System.out.println("Categoria: " + this.categoria + "              ");
		System.out.println("*************************************************");
		System.out.println("Valor: " + this.valor + "                       ");
		System.out.println("*************************************************");
		
    }
  }
