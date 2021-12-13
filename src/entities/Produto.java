package entities;

public class Produto {
	//atributos
	private String nome;
	private Double preco;
	
	//construtores
	public Produto() {
		super();
	}
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	//metodos
	public String etiqueta() {
		return getNome() + " $ " + String.format("%.2f",getPreco()); 
	}
	
	
}
