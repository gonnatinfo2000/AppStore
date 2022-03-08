import java.time.LocalDate;
import java.util.List;

public class Avaliacao {
	// Atributos
	
	private double avaliacao;
	private String comentario;
	private Cliente cliente;
	
	// Construtor
	public Avaliacao(Cliente cliente, double avaliacao, String comentario) {
		this.cliente = cliente;
		this.avaliacao = avaliacao;
		this.comentario = comentario;
	}
	
	// getters e setters
	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
