package headfirst.designpatterns.factoryMethod.factory;

import headfirst.designpatterns.factoryMethod.pizza.CheesePizza;
import headfirst.designpatterns.factoryMethod.pizza.ClamPizza;
import headfirst.designpatterns.factoryMethod.pizza.PepperoniPizza;
import headfirst.designpatterns.factoryMethod.pizza.Pizza;
import headfirst.designpatterns.factoryMethod.pizza.VeggiePizza;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza();
		}else if(type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}else if(type.equals("clam")) {
			pizza = new ClamPizza();
		}else if(type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
