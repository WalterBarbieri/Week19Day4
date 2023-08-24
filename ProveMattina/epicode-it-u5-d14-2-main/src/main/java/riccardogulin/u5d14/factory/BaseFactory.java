package riccardogulin.u5d14.factory;

public abstract class BaseFactory {

	public Pizza orderPizza() {
		Pizza p = createPizza();
		p.getIngredienti();
		System.out.println("Costo totale: " + (p.getPrezzoBase() + 2));
		return p;
	}

	public abstract Pizza createPizza();

}
