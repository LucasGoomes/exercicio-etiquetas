package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	//atributos
	private Date dataFabricacao;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//construtores
	public ProdutoUsado() {
		super();
	}
	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}
	//getter e setter
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	//metodos
	@Override
	public String etiqueta() {
		return getNome() + " (usado) $ " + String.format("%.2f", getPreco()) + " (data de fabricação: " + sdf.format(dataFabricacao) + ")"; 
	}
	
}
