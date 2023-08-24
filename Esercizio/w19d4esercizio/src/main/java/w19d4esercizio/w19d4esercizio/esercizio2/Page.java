package w19d4esercizio.w19d4esercizio.esercizio2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Page extends AbstractBookComponent {
	private String text;
	private int numeroPagina;

	public Page(String text, int numeroPagina) {
		super();
		this.text = text;
		this.numeroPagina = numeroPagina;
	}

	@Override
	public int getNumeroPagine() {
		return 1;
	}

	@Override
	public void print() {
		System.out.println("Pagina numero: " + numeroPagina);
		System.out.println(text);

	}

}
