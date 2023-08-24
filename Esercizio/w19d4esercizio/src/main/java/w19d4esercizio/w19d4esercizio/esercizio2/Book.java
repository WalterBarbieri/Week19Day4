package w19d4esercizio.w19d4esercizio.esercizio2;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Book implements BookInterface {
//	public List<Integer> numeroPagina;
	public List<String> autori;
	public List<String> sezioni;
	public List<String> sottoSezione;
	public double price;

	@Override
	public void print() {
		System.out.println("Libro intero");

	}

	@Override
	public void getAutori() {
		for (String autore : autori) {
			System.out.println("Autore:" + autore);
		}
	}

	@Override
	public int getNumeroPagine() {
		return 0;
	}

}
