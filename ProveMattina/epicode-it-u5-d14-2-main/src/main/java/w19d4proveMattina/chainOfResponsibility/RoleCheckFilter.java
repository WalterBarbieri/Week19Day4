package w19d4proveMattina.chainOfResponsibility;

public class RoleCheckFilter extends Filter {

	@Override
	public void check(User u) {
		if (u.getRole().equals("admin")) {
			System.out.println("Welcome Admin");
			this.goNext(u);
		} else {
			System.out.println("Go away noAdmin");
		}

	}

}
