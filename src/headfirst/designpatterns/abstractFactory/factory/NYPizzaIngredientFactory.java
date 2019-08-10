package headfirst.designpatterns.abstractFactory.factory;

import headfirst.designpatterns.abstractFactory.ingredient.Cheese;
import headfirst.designpatterns.abstractFactory.ingredient.Clams;
import headfirst.designpatterns.abstractFactory.ingredient.Dough;
import headfirst.designpatterns.abstractFactory.ingredient.FreshClams;
import headfirst.designpatterns.abstractFactory.ingredient.Garlic;
import headfirst.designpatterns.abstractFactory.ingredient.MarinaraSauce;
import headfirst.designpatterns.abstractFactory.ingredient.Mushroom;
import headfirst.designpatterns.abstractFactory.ingredient.Onion;
import headfirst.designpatterns.abstractFactory.ingredient.Pepperoni;
import headfirst.designpatterns.abstractFactory.ingredient.RedPepper;
import headfirst.designpatterns.abstractFactory.ingredient.ReggianoCheese;
import headfirst.designpatterns.abstractFactory.ingredient.Sauce;
import headfirst.designpatterns.abstractFactory.ingredient.SlicedPepperoni;
import headfirst.designpatterns.abstractFactory.ingredient.ThinCrustDough;
import headfirst.designpatterns.abstractFactory.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}
	
}
