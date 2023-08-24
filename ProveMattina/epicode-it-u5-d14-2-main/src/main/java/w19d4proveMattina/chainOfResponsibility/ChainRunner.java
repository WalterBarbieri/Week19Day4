package w19d4proveMattina.chainOfResponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		User u = new User("admin@gmail.it", "1234", "admin");
		LoggerFilter logger = new LoggerFilter();
		CredentialsFitler credential = new CredentialsFitler();
		RoleCheckFilter roleCheck = new RoleCheckFilter();
		logger.setNext(credential);
		credential.setNext(roleCheck);
		logger.check(u);

	}

}
