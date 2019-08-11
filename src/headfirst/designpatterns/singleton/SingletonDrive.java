package headfirst.designpatterns.singleton;

public class SingletonDrive {
	public static void main(String[] args) {
		ChocolateBoiler cb1 = ChocolateBoiler.getInstance();
		System.out.println(cb1);
		
		
		ChocolateBoiler cb2 = ChocolateBoiler.getInstance();
		System.out.println(cb2);
		
	}
	
}