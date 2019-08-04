package headfirst.designpatterns.decorator.beverage;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		this.description = "다크로스트";
	}

	@Override
	public double cost() {
		return 0.99;
	}
}
