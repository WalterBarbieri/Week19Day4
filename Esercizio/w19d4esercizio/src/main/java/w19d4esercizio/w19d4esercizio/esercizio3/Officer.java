package w19d4esercizio.w19d4esercizio.esercizio3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Officer {
	protected Officer nextOfficer;
	protected String rank;
	protected int salary;

	public Officer(String rank, int salary) {
		super();
		this.rank = rank;
		this.salary = salary;
	}

	public void processRequest(int amount) {
		if (amount < salary) {
			System.out.println("Un " + rank + " percepisce più di questo importo");
		} else if (amount == salary) {
			System.out.println("Un " + rank + " percepisce esattamente questo importo");
		} else if (nextOfficer != null) {
			System.out.println("Un " + rank + " percepisce meno di questo importo");
			nextOfficer.processRequest(amount);
		} else {
			System.out.println("Un " + rank + " percepisce meno di questo importo");
			System.out.println("Nessun Ufficiale guadagna tutti questi soldi!");
		}
	}

}
