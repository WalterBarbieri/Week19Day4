package w19d4esercizio.w19d4esercizio.esercizio1;

import lombok.Getter;

@Getter
public class UserData {
	private String nomeCompleto;
	private int eta;

	public void getData(DataSource ds) {
		nomeCompleto = ds.getNomeCompleto();
		eta = ds.getEta();
	}
}
