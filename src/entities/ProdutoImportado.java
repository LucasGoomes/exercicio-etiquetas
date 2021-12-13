package entities;

public class ProdutoImportado extends Produto{
	//atributos
	private Double taxaAlfandega;
	
	//construtores
	public ProdutoImportado() {
		super();
	}
	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}
	//getter e setter
	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}
	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	//metodos
	public Double precoTotal() {
		return getPreco() + getTaxaAlfandega();
	}
	@Override
	public String etiqueta() {
		return getNome() + " $ " + String.format("%.2f", precoTotal()) + "(Taxa da alfandega: $ " + String.format("%.2f", getTaxaAlfandega()) + ") "; 
	}
	
	
	
	
	
}
