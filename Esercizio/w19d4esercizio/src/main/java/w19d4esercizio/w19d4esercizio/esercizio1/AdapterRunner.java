package w19d4esercizio.w19d4esercizio.esercizio1;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdapterRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Info info = new Info();
		info.setNome("Pino");
		info.setCognome("Marino");
		info.setDataDiNascita(LocalDate.of(1861, 6, 2));

		UserDataAdapter uda = new UserDataAdapter(info);

		UserData ud = new UserData();

		ud.getData(uda);

		System.out.println("Nome completo :" + ud.getNomeCompleto() + ", Eta: " + ud.getEta());

	}

}
