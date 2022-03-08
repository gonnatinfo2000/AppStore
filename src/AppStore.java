import java.util.ArrayList;
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
			System.out.println("Avaliação da aplicação:" +aplicacao.mediaAvaliacoes());
			System.out.println("Avaliação do programador:" + aplicacao.getProgramador().mediaAvaliacoesProgramador());
		}
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
				System.out.println(games);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.Business)) {
				business.add(aplicacao);
				System.out.println(business);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.Education)) {
				education.add(aplicacao);
				System.out.println(education);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.Lifestyle)) {
				lifestyle.add(aplicacao);
				System.out.println(lifestyle);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.Entertainment)) {
				entertainment.add(aplicacao);
				System.out.println(entertainment);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.Utilities)) {
				utilities.add(aplicacao);
				System.out.println(utilities);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.Travel)) {
				travel.add(aplicacao);
				System.out.println(travel);
			}
			if(aplicacao.getTipo().equals(TipoAplicacao.HealthAndFitness)) {
				healthandfitness.add(aplicacao);
				System.out.println(healthandfitness);
			}
		}
	}
}


