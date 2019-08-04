package headfirst.designpatterns.decorator.condiment;

import headfirst.designpatterns.decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}
}
