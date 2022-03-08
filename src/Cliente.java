import java.util.ArrayList;
import java.util.List;

public class Cliente extends Utilizador {
	
	public List<Aplicacao> aplicacoes;
	public List<Compra> compras;
	private boolean isComprado;
	
	// Construtor	
	public Cliente(String nome, int idade, int num_unico) {
		super(nome, idade, num_unico);
		this.aplicacoes = new ArrayList<Aplicacao>();
	}
	
	// Getters e setters
	public List<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}

	public void setAplicacoes(List<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}
	public List<Compra> getCompras() {
		return compras;
	}
	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
	
}
