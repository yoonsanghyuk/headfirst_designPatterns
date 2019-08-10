package headfirst.designpatterns.abstractFactory.pizza;

import headfirst.designpatterns.abstractFactory.ingredient.Cheese;
import headfirst.designpatterns.abstractFactory.ingredient.Clams;
import headfirst.designpatterns.abstractFactory.ingredient.Dough;
import headfirst.designpatterns.abstractFactory.ingredient.Pepperoni;
import headfirst.designpatterns.abstractFactory.ingredient.Sauce;
import headfirst.designpatterns.abstractFactory.ingredient.Veggies;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	
	abstract public void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}
}
