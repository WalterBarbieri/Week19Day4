package w19d4esercizio.w19d4esercizio.esercizio3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChainOfCommand {
	@Bean
	public Officer buildChain() {
		Capitano capitano = new Capitano();
		Maggiore maggiore = new Maggiore();
		Tenente tenente = new Tenente();
		Colonnello colonnello = new Colonnello();
		Generale generale = new Generale();

		capitano.setNextOfficer(maggiore);
		maggiore.setNextOfficer(tenente);
		tenente.setNextOfficer(colonnello);
		colonnello.setNextOfficer(generale);
		return capitano;
	}

}
