package w19d4esercizio.w19d4esercizio.esercizio2;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Libro extends AbstractBookComponent {
	private String title;
	private String bookAuthor;
	private double price;
	private List<Sezione> sezioni;
	private List<SottoSezione> sottoSezioni;
	private List<Page> pagine;

	public Libro(String title, String bookAuthor, double price) {
		super();
		this.title = title;
		this.bookAuthor = bookAuthor;
		this.price = price;
		this.pagine = new ArrayList<>();
	}

	@Override
	public int getNumeroPagine() {
		int bookPages = 0;
		if (sezioni != null) {
			for (Sezione sezione : sezioni) {
				bookPages += sezione.getNumeroPagine();
			}
		} else if (sottoSezioni != null) {
			for (SottoSezione sottoSezione : sottoSezioni) {
				bookPages += sottoSezione.getNumeroPagine();
			}
		} else {
			for (Page page : pagine) {
				bookPages += page.getNumeroPagine();
			}
		}

		return bookPages;
	}

	@Override
	public void print() {
		System.out.println("Libro: " + title + ", Autore: " + bookAuthor + ", Prezzo: " + price + "€");
		System.out.println("*******************************");
		if (sezioni != null) {
			for (Sezione sezione : sezioni) {
				sezione.print();
			}
		} else if (sottoSezioni != null) {
			for (SottoSezione sottoSezione : sottoSezioni) {
				sottoSezione.print();
			}
		} else {
			for (Page page : pagine) {
				page.print();
			}
		}

	}

	public Page getpaginaByNumero(int numero) {
		if (sezioni != null) {
			for (Sezione sezione : sezioni) {
				if (sezione.getSottoSezioni() != null) {
					for (SottoSezione sottoSezione : sezione.getSottoSezioni()) {
						if (sottoSezione.getPages() != null) {
							for (Page page : sottoSezione.getPages()) {
								if (page.getNumeroPagina() == numero) {
									return page;
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

}
