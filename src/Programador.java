import java.util.ArrayList;
import java.util.List;

public class Programador extends Utilizador {
	
	// Atributos
	protected double avaliacao;
	private List<Avaliacao> avaliacoes;
	private List<Aplicacao> aplicacoes;
	
	// Construtor	
	public Programador(String nome, int idade, int num_unico, double avaliacao) {
		super(nome, idade, num_unico);
		this.avaliacao = avaliacao;
		this.avaliacoes = new ArrayList<Avaliacao>();
	}

	// getters e setters
	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public List<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}

	public void setAplicacoes(List<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}
	
	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}	
	
	public int mediaAvaliacoesProgramador() {
		int media = 0;
		for(Avaliacao avaliacao_aplicacao: avaliacoes) {
			media += avaliacao_aplicacao.getAvaliacao();
		}
		media = media / avaliacoes.size();
		return media;
	}

	
}
