package headfirst.designpatterns.decorator.beverage;

public class Decaffein extends Beverage{
	
	public Decaffein() {
		super.description = "디카페인";
	}

	@Override
	public double cost() {
		return 1.05;
	}
}
