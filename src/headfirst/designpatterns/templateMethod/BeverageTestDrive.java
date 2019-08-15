package headfirst.designpatterns.templateMethod;

import headfirst.designpatterns.templateMethod.beverage.Coffee;
import headfirst.designpatterns.templateMethod.beverage.Tea;

public class BeverageTestDrive {
	public static void main(String[] args) {
		Tea teaWithoutHook = new Tea();
		Coffee coffeeWithHook = new Coffee();
		
		System.out.println("\n차 준비중..");
		teaWithoutHook.prepareRecipe();
		
		System.out.println("\n커피 준비중..");
		coffeeWithHook.prepareRecipe();
		
	}
}
