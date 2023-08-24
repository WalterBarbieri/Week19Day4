package w19d4esercizio.w19d4esercizio.esercizio3;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainOfResponsibilityRunner implements CommandLineRunner {

	@Autowired
	private Officer commandChain;

	@Override
	public void run(String... args) throws Exception {
		Random random = new Random();

		int amount = random.nextInt(6500) + 500;
		System.out.println("Stipendio: " + amount + "€");
		commandChain.processRequest(amount);
	}

}
