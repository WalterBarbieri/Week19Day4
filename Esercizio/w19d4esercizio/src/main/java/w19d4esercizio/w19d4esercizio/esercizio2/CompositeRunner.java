package w19d4esercizio.w19d4esercizio.esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Component
public class CompositeRunner implements CommandLineRunner {
	Faker faker = new Faker();
	Random random = new Random();

	@Override
	public void run(String... args) throws Exception {

		Libro book1 = new Libro("Primo Libro", "Gigi il Pescatore", 19.99);
		int numeroPagine = 1;
		int magicNumber = random.nextInt(15) + 2;
		Sezione section1 = new Sezione("Primo Capitolo: pescare trote in Alaska", "Gigi il Pescatore");

		SottoSezione subSection1 = new SottoSezione("Introduzione e rigraziamenti");
		List<Page> pageList = new ArrayList<>();
		for (int i = 0; i < magicNumber; i++) {
			String rndText = faker.lorem().paragraph();
			pageList.add(new Page(rndText, numeroPagine));
			numeroPagine += 1;

		}
		subSection1.setPages(pageList);

		SottoSezione subSection2 = new SottoSezione("Pesca artica in infradito");
		List<Page> pageList2 = new ArrayList<>();
		for (int i = 0; i < magicNumber; i++) {
			String rndText = faker.lorem().paragraph();
			pageList2.add(new Page(rndText, numeroPagine));
			numeroPagine += 1;
		}
		subSection2.setPages(pageList2);

		List<SottoSezione> sottoSezioni = new ArrayList<>();
		sottoSezioni.add(subSection1);
		sottoSezioni.add(subSection2);

		section1.setSottoSezioni(sottoSezioni);

		Sezione section2 = new Sezione("Secondo Capitolo: pescare scarpe nell'Arno", "Nino il motorino");
		SottoSezione subSection3 = new SottoSezione(
				"Rudimenti di pesca nella melma: come sopravvivere all'inquinamento");
		List<Page> pageList3 = new ArrayList<>();
		for (int i = 0; i < magicNumber; i++) {
			String rndText = faker.lorem().paragraph();
			pageList3.add(new Page(rndText, numeroPagine));
			numeroPagine += 1;
		}
		subSection3.setPages(pageList3);

		SottoSezione subSection4 = new SottoSezione("Combattere con i lacci");
		List<Page> pageList4 = new ArrayList<>();
		for (int i = 0; i < magicNumber; i++) {
			String rndText = faker.lorem().paragraph();
			pageList4.add(new Page(rndText, numeroPagine));
			numeroPagine += 1;
		}
		subSection4.setPages(pageList4);

		List<SottoSezione> sottoSezioni2 = new ArrayList<>();
		sottoSezioni2.add(subSection3);
		sottoSezioni2.add(subSection4);

		section2.setSottoSezioni(sottoSezioni2);

		List<Sezione> sezioni = new ArrayList<>();
		sezioni.add(section1);
		sezioni.add(section2);

		book1.setSezioni(sezioni);

//		book1.print();
//		section1.print();
//		subSection1.print();
//		subSection2.print();
		System.out.println("Numero Pagine: " + (numeroPagine - 1));

//		Page pagina = book1.getpaginaByNumero(random.nextInt(numeroPagine - 1));
//		if (pagina != null) {
//			pagina.print();
//		} else {
//			System.out.println("Pagina non trovata");
//		}

	}

}
