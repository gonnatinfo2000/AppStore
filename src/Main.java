import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	
		private static final AtomicInteger count = new AtomicInteger(0);
		private static final List<Aplicacao> aplicacoes = null;  
		
		public static void main(String[] args) {
			
			AppStore app = new AppStore();
	
			Utilizador cliente1 = new Cliente("Amanda", 30, count.incrementAndGet());
			Utilizador cliente2 = new Cliente("Décio", 50, count.incrementAndGet());
			Utilizador cliente3 = new Cliente("Lobini", 31, count.incrementAndGet());
			
			Utilizador programador1 = new Programador("Maria", 30, count.incrementAndGet(), 0);
			Utilizador programador2 = new Programador("Zavrov", 45, count.incrementAndGet(), 0);
			Utilizador programador3 = new Programador("Nunês", 36, count.incrementAndGet(), 0);
			
			app.registarUtilizador(cliente1);
			app.registarUtilizador(cliente2);
			app.registarUtilizador(cliente3);
			app.registarUtilizador(programador1);
			app.registarUtilizador(programador2);
			app.registarUtilizador(programador3);
			
			Aplicacao aplicacao1 = new Aplicacao("iFit", 2.99, 0, TipoAplicacao.HealthAndFitness, (Programador) programador1);
			Aplicacao aplicacao2 = new Aplicacao("FastQuiz", 5.99, 0, TipoAplicacao.Entertainment, (Programador) programador2);
			Aplicacao aplicacao3 = new Aplicacao("Water Quest", 10.99, 0, TipoAplicacao.Games, (Programador) programador3);
			Aplicacao aplicacao4 = new Aplicacao("Macho", 4.99, 0, TipoAplicacao.Lifestyle, (Programador) programador1);
			Aplicacao aplicacao5 = new Aplicacao("WeTravel", 0.99, 0, TipoAplicacao.Travel, (Programador) programador1);
			Aplicacao aplicacao6 = new Aplicacao("Teachers and Students", 8.99, 0, TipoAplicacao.Education, (Programador) programador3);
			
			app.incluirAplicacao(aplicacao1);
			app.incluirAplicacao(aplicacao2);
			app.incluirAplicacao(aplicacao3);
			app.incluirAplicacao(aplicacao4);
			app.incluirAplicacao(aplicacao5);
			app.incluirAplicacao(aplicacao6);
			
			app.listaUtilizadores();
			
			Compra compra1 = new Compra((Cliente) cliente1, LocalDate.now(), 0.00, aplicacoes);
			compra1.acrescentarAplicacoes(aplicacao1);
			
			Compra compra2 = new Compra((Cliente) cliente2, LocalDate.now(), 0.00, aplicacoes);
			compra2.acrescentarAplicacoes(aplicacao1);
			compra2.acrescentarAplicacoes(aplicacao5);
			compra2.acrescentarAplicacoes(aplicacao6);
			
			Compra compra3 = new Compra((Cliente) cliente3, LocalDate.now(), 0.00, aplicacoes);
			compra3.acrescentarAplicacoes(aplicacao1);
			compra3.acrescentarAplicacoes(aplicacao3);
			
			app.realizarCompra(compra1);
			app.realizarCompra(compra2);
			app.realizarCompra(compra3);
			
			Avaliacao avaliacao1 = new Avaliacao((Cliente) cliente1, 4, "Esta aplicação é fixe.");
			Avaliacao avaliacao2 = new Avaliacao((Cliente) cliente2, 4, "Uma aplicação decente.");
			Avaliacao avaliacao3 = new Avaliacao((Cliente) cliente2, 5, "Ótimo para viajar.");
			Avaliacao avaliacao4 = new Avaliacao((Cliente) cliente2, 5, "Ajuda bastante.");
			Avaliacao avaliacao5 = new Avaliacao((Cliente) cliente3, 4, "Ótimo ;).");
			Avaliacao avaliacao6 = new Avaliacao((Cliente) cliente3, 5, "Este jogo é o MÁXIMO!.");
			
			app.atribuirAvaliacao(compra1, avaliacao1, aplicacao1);
			app.atribuirAvaliacao(compra2, avaliacao2, aplicacao1);
			app.atribuirAvaliacao(compra2, avaliacao3, aplicacao5);
			app.atribuirAvaliacao(compra2, avaliacao4, aplicacao6);
			app.atribuirAvaliacao(compra3, avaliacao5, aplicacao1);
			app.atribuirAvaliacao(compra3, avaliacao6, aplicacao3);
		
			app.listagemSeletiva();
			
			app.listagemOrdenada();
			
			// System.out.println(compra2.getCliente());
			// System.out.println(compra2.getAplicacoes());
			// System.out.println(compra2.getPreco());
			// System.out.println(aplicacao1.getAvaliacao());
			// System.out.println(((Programador) programador1).getAvaliacao());
		}
		
}
