import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Compra {
	
	// Atributos
	
	private Cliente cliente;
	private LocalDate date;
	private double preco;
	private List<Aplicacao> aplicacoes;
	
	// Construtor
	
	public Compra(Cliente cliente, LocalDate date, double preco, List<Aplicacao> aplicacoes) {
		this.cliente = cliente;
		this.date = date;
		this.preco = preco;
		this.aplicacoes = new ArrayList<Aplicacao>();
	}
	
	// getters e setters
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}

	public void setAplicacao(List<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}
	
	// Métodos
	
	public void acrescentarAplicacoes(Aplicacao aplicacao) {
		aplicacoes.add(aplicacao);
		preco += aplicacao.getPreco();
	}

}
