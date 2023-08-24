package w19d4esercizio.w19d4esercizio.esercizio2;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sezione extends AbstractBookComponent {
	private String title;
	private String sectionAuthor;
	private List<SottoSezione> sottoSezioni;
	private List<Page> pagine;

	public Sezione(String title, String sectionAuthor) {
		super();
		this.title = title;
		this.sectionAuthor = sectionAuthor;
	}

	@Override
	public int getNumeroPagine() {
		int sectionPages = 0;
		if (sottoSezioni != null) {
			for (SottoSezione sottoSezione : sottoSezioni) {
				sectionPages += sottoSezione.getNumeroPagine();
			}
		} else {
			for (Page page : pagine) {
				sectionPages += page.getNumeroPagine();
			}
		}

		return sectionPages;
	}

	@Override
	public void print() {
		System.out.println("Sezione: " + title + ", Autore: " + sectionAuthor);
		System.out.println("*******************************");

		if (sottoSezioni != null) {
			for (SottoSezione sottoSezione : sottoSezioni) {
				sottoSezione.print();
			}
		} else {
			for (Page page : pagine) {
				page.print();
			}
		}

	}

}
