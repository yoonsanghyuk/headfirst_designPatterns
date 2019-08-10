package headfirst.designpatterns.abstractFactory.factory;

import headfirst.designpatterns.abstractFactory.ingredient.Cheese;
import headfirst.designpatterns.abstractFactory.ingredient.Clams;
import headfirst.designpatterns.abstractFactory.ingredient.Dough;
import headfirst.designpatterns.abstractFactory.ingredient.Pepperoni;
import headfirst.designpatterns.abstractFactory.ingredient.Sauce;
import headfirst.designpatterns.abstractFactory.ingredient.Veggies;

public interface PizzaIngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();

}
