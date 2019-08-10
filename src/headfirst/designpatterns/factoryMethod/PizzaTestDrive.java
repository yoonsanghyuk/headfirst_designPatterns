package headfirst.designpatterns.factoryMethod;

import headfirst.designpatterns.factoryMethod.store.NYPizzaStore;
import headfirst.designpatterns.factoryMethod.store.PizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		
		nyStore.orderPizza("cheese");
		
	}

}
