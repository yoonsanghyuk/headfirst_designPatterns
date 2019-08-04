package headfirst.designpatterns.decorator.condiment;

import headfirst.designpatterns.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage{
	public abstract String getDescription();
}
