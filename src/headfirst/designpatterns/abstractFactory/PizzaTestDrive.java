package headfirst.designpatterns.abstractFactory;

import headfirst.designpatterns.abstractFactory.store.NYPizzaStore;
import headfirst.designpatterns.abstractFactory.store.PizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		
		nyStore.orderPizza("cheese");
		
	}

}
