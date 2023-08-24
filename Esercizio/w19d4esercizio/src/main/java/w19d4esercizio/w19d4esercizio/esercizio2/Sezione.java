package w19d4esercizio.w19d4esercizio.esercizio2;

public class Sezione extends Book {
	public String autore;
	public String name;

	@Override
	public void print() {
		System.out.println("Sezione: " + name);
	}

	@Override
	public void getAutori() {
		this.autori.add(autore);
	}

}
