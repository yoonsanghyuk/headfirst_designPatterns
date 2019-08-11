package headfirst.designpatterns.singleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	private static ChocolateBoiler uniqueInstance;
	public static ChocolateBoiler getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			// 우유/초콜릿을 혼합하여 넣음.
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
			// 재료를 다음단계로 보
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			// 재료를 끓임
			empty = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
