package headfirst.designpatterns.iterator;

import headfirst.designpatterns.iterator.menu.DinerMenu;
import headfirst.designpatterns.iterator.menu.PancakeHouseMenu;
import headfirst.designpatterns.iterator.waitress.Waitress;

public class MenuTestDrive {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();
	}
}
