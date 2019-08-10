package headfirst.designpatterns.abstractFactory.store;

import headfirst.designpatterns.abstractFactory.factory.NYPizzaIngredientFactory;
import headfirst.designpatterns.abstractFactory.factory.PizzaIngredientFactory;
import headfirst.designpatterns.abstractFactory.pizza.CheesePizza;
import headfirst.designpatterns.abstractFactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

	public NYPizzaStore() {
	}

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		
		
		if (type.equals("cheese")){
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("New York Style Cheese Pizza!");
		}else if (type.equals("veggie")){
//			return new NYStyleVeggiePizza();
		}else if (type.equals("clam")){
//			return new NYStyleClamPizza();
		}else if (type.equals("pepperoni")){
//			return new NYStylePepperoniPizza();
		}
		
		return pizza;
	}

}
