package w19d4proveMattina.observer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ObserverRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		User u = new User();
		Mediaworld m = new Mediaworld();
		AppleStore as = new AppleStore();

		Apple a = new Apple();

		a.addSubscriber(u);
		a.addSubscriber(as);
		a.addSubscriber(m);

		a.makeAnnouncement("E' uscito un nuovo prodotto");
		a.removeSubscriber(u);
		a.makeAnnouncement("Un'altro");

	}

}
