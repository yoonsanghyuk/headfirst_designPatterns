package headfirst.designpatterns.decorator.condiment;

import headfirst.designpatterns.decorator.beverage.Beverage;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 두유";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.15;
	}
}
