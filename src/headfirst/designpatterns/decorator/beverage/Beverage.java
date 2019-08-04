package headfirst.designpatterns.decorator.beverage;

public abstract class Beverage {
	String description = "no title";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
	
	
	
}
