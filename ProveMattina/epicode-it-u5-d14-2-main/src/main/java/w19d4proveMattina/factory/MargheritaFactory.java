package w19d4proveMattina.factory;

public class MargheritaFactory extends BaseFactory {

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new Margherita();
	}

}
