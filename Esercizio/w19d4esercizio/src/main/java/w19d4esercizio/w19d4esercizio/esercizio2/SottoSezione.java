package w19d4esercizio.w19d4esercizio.esercizio2;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SottoSezione extends AbstractBookComponent {

	private String title;
	private List<Page> pages;

	public SottoSezione(String title) {
		super();
		this.title = title;
	}

	@Override
	public int getNumeroPagine() {
		int subSectionPages = 0;
		for (Page page : pages) {
			subSectionPages += page.getNumeroPagine();
		}
		return subSectionPages;

	}

	@Override
	public void print() {
		System.out.println("Sotto Sezione: " + title);
		System.out.println("*******************************");

		for (Page page : pages) {
			page.print();
		}

		System.out.println("*******************************");

	}

}
