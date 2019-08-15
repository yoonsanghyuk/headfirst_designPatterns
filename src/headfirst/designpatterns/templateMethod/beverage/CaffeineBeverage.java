package headfirst.designpatterns.templateMethod.beverage;

public abstract class CaffeineBeverage {
	
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();
		}
		
		
	}
	
	abstract void addCondiments();
	abstract void brew();
	
	
	private void boilWater() {
		System.out.println("물 끓이는 중");
	}

	private void pourInCup() {
		System.out.println("컵에 따르는 중");
		
	}
	
	// Hook method
	boolean customerWantsCondiments() {
		return true;
	}

	
}
