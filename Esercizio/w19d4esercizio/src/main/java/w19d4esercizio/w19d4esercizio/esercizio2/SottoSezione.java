package w19d4esercizio.w19d4esercizio.esercizio2;

public class SottoSezione extends Sezione {
	public String autore;
	public String name;

	@Override
	public void print() {
		System.out.println("Sottosezione :" + name);
	}

	@Override
	public void getAutori() {
		this.autori.add(autore);
	}

	@Override
	public int getNumeroPagine() {
		// TODO Auto-generated method stub
		return super.getNumeroPagine();
	}

}
