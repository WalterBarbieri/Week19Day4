package w19d4proveMattina.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Filter {

	private Filter next;

	public abstract void check(User u);

	public void goNext(User u) {
		if (this.getNext() != null) {
			this.next.check(u);
		} else {
			System.out.println("Siamo arrivati a fine catena");
		}
	}
}
