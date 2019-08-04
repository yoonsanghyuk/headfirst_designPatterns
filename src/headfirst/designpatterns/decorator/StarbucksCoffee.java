package headfirst.designpatterns.decorator;

import headfirst.designpatterns.decorator.beverage.Beverage;
import headfirst.designpatterns.decorator.beverage.DarkRoast;
import headfirst.designpatterns.decorator.beverage.Espresso;
import headfirst.designpatterns.decorator.beverage.HouseBlend;
import headfirst.designpatterns.decorator.condiment.Mocha;
import headfirst.designpatterns.decorator.condiment.Soy;
import headfirst.designpatterns.decorator.condiment.Whip;

public class StarbucksCoffee {
	public static void main(String[] args) {
		// 에스프레소 기본형
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $ " + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());
		
		
	}
}
