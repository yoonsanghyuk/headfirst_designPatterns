package headfirst.designpatterns.factoryMethod.store;

import headfirst.designpatterns.factoryMethod.pizza.NYStyleCheesePizza;
import headfirst.designpatterns.factoryMethod.pizza.NYStyleClamPizza;
import headfirst.designpatterns.factoryMethod.pizza.NYStylePepperoniPizza;
import headfirst.designpatterns.factoryMethod.pizza.NYStyleVeggiePizza;
import headfirst.designpatterns.factoryMethod.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

	public NYPizzaStore() {
	}

	@Override
	Pizza createPizza(String type) {
		if (type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if (type.equals("veggie")){
			return new NYStyleVeggiePizza();
		}else if (type.equals("clam")){
			return new NYStyleClamPizza();
		}else if (type.equals("pepperoni")){
			return new NYStylePepperoniPizza();
		}else return null;
	}

}
