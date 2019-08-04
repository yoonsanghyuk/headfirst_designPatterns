package headfirst.designpatterns.decorator.beverage;

public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		super.description = "하우스 블렌드";
	}

	@Override
	public double cost() {
		return 0.89;
	}
}
