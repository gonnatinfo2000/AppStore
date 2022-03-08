import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
	
	// Atributos
	private String nome;
	private Programador programador;
	private double preco;
	private int avaliacao;
	private TipoAplicacao tipo;
	private List<Avaliacao> avaliacoes;
	
	// Construtor
	public Aplicacao(String nome, double preco, int avaliacao, TipoAplicacao tipo, Programador programador) {
		this.nome = nome;
		this.preco = preco;
		this.avaliacao = avaliacao;
		this.tipo = tipo;
		this.programador = programador;
		this.avaliacoes = new ArrayList<Avaliacao>();
	}

	// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public TipoAplicacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoAplicacao tipo) {
		this.tipo = tipo;
	}
	
	public Programador getProgramador() {
		return programador;
	}

	public void setProgramador(Programador programador) {
		this.programador = programador;
	}

	// Métodos

	public int mediaAvaliacoes() {
		int media = 0;
		for(Avaliacao avaliacao_aplicacao: avaliacoes) {
			media += avaliacao_aplicacao.getAvaliacao();
		}
		media = media / avaliacoes.size();
		return media;
	}

}
