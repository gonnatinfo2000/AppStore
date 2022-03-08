
public class Utilizador {
	
	// Atributos
	
	protected String nome;
	protected int idade;
	protected int num_unico;
	
	// Construtor
	
	public Utilizador(String nome, int idade, int num_unico) {
		this.nome = nome;
		this.idade = idade;
		this.num_unico = num_unico;
	}
	
	// getters e setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNum_unico() {
		return num_unico;
	}

	public void setNum_unico(int num_unico) {
		this.num_unico = num_unico;
	}

}
