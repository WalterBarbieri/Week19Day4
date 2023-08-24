package w19d4proveMattina.factory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FactoryRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		BaseFactory factory;
		
		if(true) {
			factory = new MargheritaFactory();
		} else {
			factory = new ProsciuttoFactory();
		}
		
		factory.orderPizza();
	}

}
