package riccardogulin.u5d14.factory;

public abstract class Pizza {
	protected double prezzoBase = 3.0;

	public double getPrezzoBase() {
		return prezzoBase;
	}

	public abstract void getIngredienti();

}
