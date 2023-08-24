package w19d4proveMattina.chainOfResponsibility;

public class CredentialsFitler extends Filter {

	@Override
	public void check(User u) {
		if (u.getPassword().equals("1234") && u.getEmail().equals("admin@gmail.it")) {
			System.out.println("Credenziali corrette");
			this.goNext(u);
		} else {
			System.out.println("Credenziali errate");
		}

	}

}
