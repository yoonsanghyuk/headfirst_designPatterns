package headfirst.designpatterns.templateMethod.beverage;

public class Tea extends CaffeineBeverage{
	
	@Override
	void addCondiments() {
		System.out.println("레몬을 추가하는 중");
	}

	@Override
	void brew() {
		System.out.println("차를 우려내는 중");		
	}
	
	
}
