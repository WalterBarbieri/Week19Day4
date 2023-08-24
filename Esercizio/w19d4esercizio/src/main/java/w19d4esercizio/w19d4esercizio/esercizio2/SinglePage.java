package w19d4esercizio.w19d4esercizio.esercizio2;

public class SinglePage extends SottoSezione {
	public int numeroPagina;
	public String text;

	@Override
	public void print() {
		System.out.println("Pagina n°: " + numeroPagina);
		System.out.println(text);
	}

}
