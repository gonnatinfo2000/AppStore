import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppStore {

	// Lista de compras
	
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	private List<Utilizador> utilizadores = new ArrayList<Utilizador>();
	private List<Aplicacao> aplicacoes = new ArrayList<Aplicacao>();
    private List<Compra> compras = new ArrayList<Compra>();
	
	public void registarUtilizador(Utilizador utilizador) {
		utilizadores.add(utilizador);
	}
	
	public void incluirAplicacao(Aplicacao aplicacao) {
		aplicacoes.add(aplicacao);
	}
	
	public void listaUtilizadores() {
		for(Utilizador utilizador: utilizadores) {
			System.out.println("Utilizador: " + utilizador.getNome());
			System.out.println("Idade: " + utilizador.getIdade());
			System.out.println("Nº: " + utilizador.getNum_unico());
		}
		System.out.println("\n");
	}
	
	public void realizarCompra(Compra compra) {
		compras.add(compra);	
	}
	
	public void atribuirAvaliacao(Compra compra, Avaliacao avaliacao, Aplicacao aplicacao) {
		if(compra.getAplicacoes().contains(aplicacao)) {
			aplicacao.getAvaliacoes().add(avaliacao);
			aplicacao.getProgramador().getAvaliacoes().add(avaliacao);
			System.out.println(aplicacao.getNome());
			System.out.println(aplicacao.getProgramador());
			aplicacao.getProgramador().setAvaliacao(aplicacao.getProgramador().mediaAvaliacoesProgramador());
			aplicacao.setAvaliacao(aplicacao.mediaAvaliacoes());
			System.out.println("Avaliação da aplicação:" + aplicacao.getAvaliacao());
			System.out.println("Avaliação do programador:" + aplicacao.getProgramador().getAvaliacao());
		}
		System.out.println("\n");
	}

	public void listagemSeletiva() {
		List<Aplicacao> games = new ArrayList<Aplicacao>();
		List<Aplicacao> business = new ArrayList<Aplicacao>();
		List<Aplicacao> education = new ArrayList<Aplicacao>();
		List<Aplicacao> lifestyle = new ArrayList<Aplicacao>();
		List<Aplicacao> entertainment = new ArrayList<Aplicacao>();
		List<Aplicacao> utilities = new ArrayList<Aplicacao>();
		List<Aplicacao> travel = new ArrayList<Aplicacao>();
		List<Aplicacao> healthandfitness = new ArrayList<Aplicacao>();
		
		for(Aplicacao aplicacao: aplicacoes) {
			if(aplicacao.getTipo().equals(TipoAplicacao.Games)) {
				games.add(aplicacao);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.Business)) {
				business.add(aplicacao);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.Education)) {
				education.add(aplicacao);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.Lifestyle)) {
				lifestyle.add(aplicacao);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.Entertainment)) {
				entertainment.add(aplicacao);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.Utilities)) {
				utilities.add(aplicacao);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.Travel)) {
				travel.add(aplicacao);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.HealthAndFitness)) {
				healthandfitness.add(aplicacao);
			}
		}
		
		List<Aplicacao> nota1 = new ArrayList<Aplicacao>();
		List<Aplicacao> nota2 = new ArrayList<Aplicacao>();
		List<Aplicacao> nota3 = new ArrayList<Aplicacao>();
		List<Aplicacao> nota4 = new ArrayList<Aplicacao>();
		List<Aplicacao> nota5 = new ArrayList<Aplicacao>();
		
		for(Aplicacao aplicacao: aplicacoes) {
			if(aplicacao.getAvaliacao() == 1) {
				nota1.add(aplicacao);
			}
			if(aplicacao.getAvaliacao() == 2) {
				nota2.add(aplicacao);
			}
			if(aplicacao.getAvaliacao() == 3) {
				nota3.add(aplicacao);
			}
			if(aplicacao.getAvaliacao() == 4) {
				nota4.add(aplicacao);
			}
			if(aplicacao.getAvaliacao() == 5) {
				nota5.add(aplicacao);
			}
		}
		
		System.out.println("Aplicações por categoria:");
		System.out.println("Games: " + games);
		System.out.println("Business: " + business);
		System.out.println("Education: " + education);
		System.out.println("Lifestyle: " + lifestyle);
		System.out.println("Entertainment: " + entertainment);
		System.out.println("Utilities: " + utilities);
		System.out.println("Travel: " + travel);
		System.out.println("Health & Fitness: " + healthandfitness);
		
		System.out.println("\n");
		
		System.out.println("Aplicações por classificação dos utilizadores:");
		System.out.println("Aplicações com nota 1: " + nota1);
		System.out.println("Aplicações com nota 2: " + nota2);
		System.out.println("Aplicações com nota 3: " + nota3);
		System.out.println("Aplicações com nota 4: " + nota4);
		System.out.println("Aplicações com nota 5: " + nota5);
	}
	
	public void listagemOrdenada() {
		List<String> classificacao = new ArrayList<String>();
		
		int i = 0;
		
		for(Aplicacao aplicacao: aplicacoes) {
				Aplicacao aplicacao1 = aplicacoes.get(i);
				Aplicacao aplicacao2 = aplicacoes.get(aplicacoes.size()-1);
				if(aplicacao.compareTo(aplicacao1, aplicacao2)) {
					classificacao.add(aplicacao.getNome());
					System.out.println(aplicacao.getNome());
					System.out.println(aplicacao.getAvaliacao());
				}else{
					classificacao.add(aplicacao.getNome());
					System.out.println(aplicacao.getNome());
					System.out.println(aplicacao.getAvaliacao());
				}
				i++;
			}
		
		Collections.sort(classificacao);
		System.out.println("Aplicações ordenadas por ordem de nome: " + classificacao);
		
		List<String> vendas = new ArrayList<String>();
		
		int numeroVendas = 0;
		for(Compra compra: compras) {
			for(Aplicacao aplicacao: aplicacoes) {
				if(compra.getAplicacoes().contains(aplicacao)) {
					vendas.add(aplicacao.getNome());
					numeroVendas++;
				}
			}
		}
		
		Collections.sort(vendas);
		System.out.println("Aplicações ordenadas por numero de vendas: " + vendas);
		
	}
		
}



