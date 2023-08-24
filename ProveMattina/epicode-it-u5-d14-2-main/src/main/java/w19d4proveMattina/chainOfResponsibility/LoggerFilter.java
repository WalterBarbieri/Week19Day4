package w19d4proveMattina.chainOfResponsibility;

public class LoggerFilter extends Filter {

	@Override
	public void check(User u) {
		System.out.println("Utente: " + u.toString());
		this.goNext(u);

	}

}
