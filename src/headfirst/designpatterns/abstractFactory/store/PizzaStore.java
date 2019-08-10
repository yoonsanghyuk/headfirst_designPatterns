package headfirst.designpatterns.abstractFactory.store;

import headfirst.designpatterns.abstractFactory.factory.PizzaIngredientFactory;
import headfirst.designpatterns.abstractFactory.pizza.Pizza;

public abstract class PizzaStore {
//	PizzaIngredientFactory pizzaIngredientFactory;
//	
//	public PizzaStore(PizzaIngredientFactory pizzaIngredientFactory) {
//		this.pizzaIngredientFactory = pizzaIngredientFactory;
//	}
	
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
