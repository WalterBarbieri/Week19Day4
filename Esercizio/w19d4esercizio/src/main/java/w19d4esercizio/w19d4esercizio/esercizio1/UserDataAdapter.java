package w19d4esercizio.w19d4esercizio.esercizio1;

import java.time.LocalDate;

public class UserDataAdapter extends UserData implements DataSource {

	private Info info;

	public UserDataAdapter(Info info) {
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {
		String nome = info.getNome();
		String cognome = info.getCognome();
		return nome + " " + cognome;
	}

	@Override
	public int getEta() {
		int currentYear = LocalDate.now().getYear();
		int userAge = info.getDataDiNascita().getYear();

		return currentYear - userAge;
	}

}
