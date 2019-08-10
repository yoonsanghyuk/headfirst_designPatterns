package headfirst.designpatterns.factoryMethod.store;

import headfirst.designpatterns.factoryMethod.factory.SimplePizzaFactory;
import headfirst.designpatterns.factoryMethod.pizza.Pizza;

public abstract class PizzaStore {
	SimplePizzaFactory factory;
	
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		//pizza = factory.createPizza(type);
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	abstract Pizza createPizza(String type);
}
